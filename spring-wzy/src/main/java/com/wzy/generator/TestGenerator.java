package com.wzy.generator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wzy
 * @title: TestGenerator
 * @description: TODO
 * @date 2019/7/1 21:21
 */
public class TestGenerator {
	/**
	 * 实现BeanNameGenerator的generateBeanName方法，可以自定义beanName的生成策略
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		String[] names = context.getBeanDefinitionNames();
		for(String name : names) {
			System.out.println(name);
		}
	}
}
