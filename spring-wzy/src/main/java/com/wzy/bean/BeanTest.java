package com.wzy.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName BeanTest
 * @Desc TODO
 * @Author Administrator
 * @Date 2019/6/28 16:01
 **/
public class BeanTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		System.out.println("IOC容器创建完成............");
		String[] names = context.getBeanDefinitionNames();
		for(String name : names) {
			System.out.println(name);
		}
		context.close();
	}

}
