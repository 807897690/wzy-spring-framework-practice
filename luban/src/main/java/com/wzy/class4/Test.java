package com.wzy.class4;

import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wzy
 * @title: Test
 * @description: TODO
 * @date 2019/7/13 12:48
 */
public class Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(Config.class);
		/**
		 * 模仿@Configuration注解底层对方法进行拦截
		 */
		Enhancer enhancer = new Enhancer();
		//增强父类
		enhancer.setSuperclass(DemoDao1.class);
		enhancer.setCallback(new MyMethodInterceptor());
		DemoDao1 demoDao1 = (DemoDao1) enhancer.create();
		demoDao1.test();
	}

}
