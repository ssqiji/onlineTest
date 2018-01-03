package com.ss.onlineTest.biz;

import java.util.List;

import com.ss.onlineTest.bean.Admin;
import com.ss.onlineTest.bean.Menu;

public interface IAdminBiz {
	//管理员登录
	public Admin adminLogin(String aid,String pwd);
	
	//查询菜单
	public List<Menu> findMenu(int aid);
}
