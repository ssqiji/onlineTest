<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>考试云平台</title>
<link rel="icon" href="images/title_logo.ico" type="image/x-icon"/> 
<link rel="stylesheet" type="text/css" href="../myeasyui/css/easyui.css" />
<link rel="stylesheet" type="text/css" href="../myeasyui/css/wu.css" />
<link rel="stylesheet" type="text/css" href="../myeasyui/css/icon.css" />
<script type="text/javascript" src="../myeasyui/js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="../myeasyui/js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="../myeasyui/js/easyui-lang-zh_CN.js"></script>
<style>
	#updateform p{
		margin-left:70px;
		margin-top:20px;
		font-size:13px;
	}
	#updateform p input{
		height:17px;
	}
</style>
</head>
<body class="easyui-layout">
	<div id="show_update_pwd" class="easyui-dialog" title="修改密码" data-options="iconCls:'icon-user-add',resizable:true,modal:true,closed:true">
		<form id="updateform">
			<p style="margin-top:26px">旧密码：&nbsp;&nbsp;&nbsp;
				<input type="password" id="oldpwd"/>
			</p>
			<p>新密码：&nbsp;&nbsp;&nbsp;
				<input type="password" id="newpwd"/>
			</p>
			<p>确认密码：
				<input type="password" id="renewpwd"/>
			</p>
		</form>
	</div> 
	<!-- begin of header -->
	<div class="wu-header" data-options="region:'north',border:false,split:true">
    	<div class="wu-header-left">
        	<h1>学生页面</h1>
        </div>
        <div class="wu-header-right">
        	<p><strong class="easyui-tooltip" id="LoginUserName" title="2条未读消息"></strong>，欢迎您！</p>
            <p><a href="javascript:updatepwd()">修改密码</a>|<a href="http://about.58.com/">帮助中心</a>|<a href="exit.jsp">安全退出</a></p>
        </div>
    </div>
    <!-- end of header -->
    <!-- begin of sidebar -->
	<div class="wu-sidebar" data-options="region:'west',split:true,border:true,title:'导航菜单'"> 
    	<div class="easyui-accordion" data-options="border:false,fit:true"> 
    		<ul class="easyui-tree wu-side-tree" id="menu-tree" data-options="url:'menuInfo'"></ul>
        </div>
    </div>	
    <!-- end of sidebar -->    
    <!-- begin of main -->
    <div class="wu-main" data-options="region:'center'">
        <div id="wu-tabs" class="easyui-tabs" data-options="border:false,fit:true">  
            <div title="首页" data-options="href:'',closable:false,iconCls:'icon-tip',cls:'pd3'"></div>
        </div>
    </div>
    <!-- end of main --> 
    <!-- begin of footer -->
	<div class="wu-footer" data-options="region:'south',border:true,split:true">
    	&copy; 2017 神兽  All Rights Reserved
    </div>
    <!-- end of footer -->  
    <script type="text/javascript">
		$(function(){
			$('.wu-side-tree a').bind("click",function(){
				var title = $(this).text();
				var url = $(this).attr('data-link');
				var iconCls = $(this).attr('data-icon');
				var iframe = $(this).attr('iframe')==1?true:false;
				addTab(title,url,iconCls,iframe);
			});	
			var loginUserName="${currentLoginAdmin.aname}";
			$("#LoginUserName").text(loginUserName);
			
			$("#menu-tree").tree({
				onClick : function(node) {
					var href = "ss.html";
					var txt = node.text;
					var tabs = $("#wu-tabs");

					if (node.attributes != undefined) {
						href = node.attributes.url;
						if (tabs.tabs("exists", txt)) {
							tabs.tabs("select", txt);
							return;
						} else {
							tabs.tabs("add", {
								title : txt,
								href : href,
								fit : true,
								closable:true, 
							})
						}
					}
				}
			})
		});

		/**
		* Name 选项卡初始化
		*/
		$('#wu-tabs').tabs({
			tools:[{
				iconCls:'icon-reload',
				border:false,
				handler:function(){
					$('#wu-datagrid').datagrid('reload');
				}
			}]
		});
			
		/**
		* Name 添加菜单选项
		* Param title 名称
		* Param href 链接
		* Param iconCls 图标样式
		* Param iframe 链接跳转方式（true为iframe，false为href）
		*/	
		function addTab(title, href, iconCls, iframe){
			var tabPanel = $('#wu-tabs');
			if(!tabPanel.tabs('exists',title)){
				var content = '<iframe scrolling="auto" frameborder="0"  src="'+ href +'" style="width:100%;height:100%;"></iframe>';
				if(iframe){
					tabPanel.tabs('add',{
						title:title,
						content:content,
						iconCls:iconCls,
						fit:true,
						cls:'pd3',
						closable:true
					});
				}
				else{
					tabPanel.tabs('add',{
						title:title,
						href:href,
						iconCls:iconCls,
						fit:true,
						cls:'pd3',
						closable:true
					});
				}
			}
			else
			{
				tabPanel.tabs('select',title);
			}
		}
		/**
		* Name 移除菜单选项
		*/
		function removeTab(){
			var tabPanel = $('#wu-tabs');
			var tab = tabPanel.tabs('getSelected');
			if (tab){
				var index = tabPanel.tabs('getTabIndex', tab);
				tabPanel.tabs('close', index);
			}
		}
		
		//修改密码
		function updatepwd(){
			var aname="${currentLoginAdmin.aname}";
			$('#show_update_pwd').dialog({
			    width: 350,   
			    height: 230,   
			    buttons:[{
					text:'修改',
					handler:function(){
						var oldpwd=$("#oldpwd").val();
						var newpwd=$("#newpwd").val();
						var renewpwd=$("#renewpwd").val();
						
						if(newpwd!=renewpwd){
							$.messager.show({title:'温馨提示',msg:'您两次输入的密码不一致...',timeout:2000,showType:'slide'});
							return;
						}
						
						if(oldpwd=="" || newpwd=="" || renewpwd==""){
							$.messager.show({title:'温馨提示',msg:'您输入的信息不完整...',timeout:2000,showType:'slide'});
							return;
						}
			
						$.post("../../adminServlet",{op:"updatePwd",oldpwd:oldpwd,newpwd:newpwd,aname:aname},function(data){
							if(data>0){
								$.messager.show({title:'成功提示',msg:'密码修改成功，请重新登陆...',timeout:2000,showType:'slide'});
								$("#updateform")[0].reset();
								$('#show_update_pwd').dialog("close");
								setTimeout("window.location.href='exit.jsp'",2000);
							}else{
								$.messager.alert('失败提示','密码修改失败，请稍后再试...','error');
							}
						},"text");
					}
				},{
					text:'关闭',
					handler:function(){
						$('#show_update_pwd').dialog("close");
					}
				}]
			}); 
			$('#show_update_pwd').dialog('open');  
		}
	</script>
</body>
</html>