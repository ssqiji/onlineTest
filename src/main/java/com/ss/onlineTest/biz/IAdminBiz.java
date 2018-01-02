package com.ss.onlineTest.biz;

import com.ss.onlineTest.bean.Admin;

public interface IAdminBiz {
	//管理员登录
	public Admin adminLogin(String aid,String pwd);
}
