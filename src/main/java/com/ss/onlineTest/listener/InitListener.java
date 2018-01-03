package com.ss.onlineTest.listener;

import java.io.File;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class InitListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		String basePath=arg0.getServletContext().getRealPath("");
		File fl=new File( new File(basePath).getParentFile(),"uploadfile");
		if(!fl.exists()){
			fl.mkdirs();
		}
	}
}
