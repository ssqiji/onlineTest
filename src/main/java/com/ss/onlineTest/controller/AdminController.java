package com.ss.onlineTest.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.ss.onlineTest.bean.Admin;
import com.ss.onlineTest.bean.Menu;
import com.ss.onlineTest.biz.IAdminBiz;

@Controller
public class AdminController {
	@Autowired
	private IAdminBiz adminBiz;
	
	@RequestMapping("/adminLogin")
	@ResponseBody
	public String adminLogin(HttpSession session,String aid,String pwd){
		Admin admin = this.adminBiz.adminLogin(aid, pwd);
		Gson gson = new Gson();
		
		if(admin == null){
			return null;
		}else{
			session.setAttribute("currentLoginAdmin", admin);
			return gson.toJson(admin);
		}
	} 
	
	@RequestMapping("/back/loginOk")
	public String loginOk(){
		return "WEB-INF/back/index";
	}
	
	@RequestMapping("/back/menuInfo")
	@ResponseBody
	public String menuInfo(HttpSession session){
		Object obj=session.getAttribute("currentLoginAdmin");
		if(obj!=null){
			List<Menu> list=this.adminBiz.findMenu(((Admin)obj).getAid() );
			Gson gson=new Gson();
			return gson.toJson(list);
		}else{
			return "";
		}
	}
	
	@RequestMapping("/back/**")
	public String backInfo(HttpServletRequest request){
		String path=request.getRequestURI().replace(request.getContextPath(),"");
		System.out.println(path);
		return "WEB-INF/"+path;
	}
}
