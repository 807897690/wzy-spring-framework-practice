package com.wzy.property_source;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wzy
 * @title: Test
 * @description: TODO
 * @date 2019/8/21 16:35
 */
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(applicationContext.getEnvironment().getProperty("jdbc.driver"));
	}

}
