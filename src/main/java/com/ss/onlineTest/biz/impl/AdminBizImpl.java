package com.ss.onlineTest.biz.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ss.onlineTest.bean.Admin;
import com.ss.onlineTest.biz.IAdminBiz;
import com.ss.onlineTest.dao.IBaseDao;
import com.ss.onlineTest.util.StringUtil;

@SuppressWarnings({"rawtypes","unchecked"})
@Service
public class AdminBizImpl implements IAdminBiz{
	@Autowired
	private IBaseDao baseDao;

	@Override
	public Admin adminLogin(String aid, String pwd) {  //管理员登录
		if(StringUtil.isNull(aid,pwd)){
			return null;
		}else{
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("aid", aid);
			map.put(pwd, pwd);
			return (Admin) this.baseDao.find(Admin.class, map, "adminLogin");
		}
	}
}
