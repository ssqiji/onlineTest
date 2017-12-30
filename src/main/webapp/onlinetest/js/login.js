$(function () {
   $("#username").focus(
        function () {
            $(".usernameDiv").css("border-color","#1A8DFF");
        }
    );
    $("#username").blur(
        function () {
            $(".usernameDiv").css("border-color","#999999");
        }
    );
    $("#password").focus(
        function () {
            $(".passwordDiv").css("border-color","#1A8DFF");
        }
    );
    $("#password").blur(
        function () {
            $(".passwordDiv").css("border-color","#999999");
        }
    )
});

//点击登录按钮
function userLogin() {
    var username = $.trim($("#username").val());
    var password = $.trim($("#password").val());
    if(username==""){
        alert("账号不能为空 ! 请重新填写 !");
        return;
    }
    if(password==""){
        alert("用户密码不能为空 ! 请重新填写 !");
        return;
    }
    
    
}