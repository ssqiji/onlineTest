package com.ss.onlineTest.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.ss.onlineTest.bean.Admin;
import com.ss.onlineTest.biz.IAdminBiz;

@Controller
public class AdminController {
	@Autowired
	private IAdminBiz adminBiz;
	
	@RequestMapping("/adminLogin")
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
}
