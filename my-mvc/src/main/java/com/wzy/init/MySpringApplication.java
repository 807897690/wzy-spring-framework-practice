package com.wzy.init;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

/**
 * @author wzy
 * @title: MySpringApplication
 * @description: TODO
 * @date 2019/8/19 10:04
 */
public class MySpringApplication {

	public static void run() {
		AnnotationConfigWebApplicationContext applicationContext =
				new AnnotationConfigWebApplicationContext();
		applicationContext.register(AppConfig.class);
		applicationContext.refresh();

		File base = new File(System.getProperty("java.io.tmpdir"));
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(9090);
		Context context = tomcat.addContext("/", base.getAbsolutePath());
		//tomcat启动过程中就会调用DispatcherServlet#init方法
		DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);
		tomcat.addServlet(context, "mymvc", dispatcherServlet).setLoadOnStartup(1);
		context.addServletMappingDecoded("/", "mymvc");
		try {
			tomcat.start();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}
		tomcat.getServer().await();

	}

}
