package com.wzy.class5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wzy
 * @title: Test
 * @description: TODO
 * @date 2019/7/20 14:09
 */
public class Test {

	/**
	 * spring默认自动装配策略是AUTOWIRE_NO，AUTOWIRE_NO自动装配策略采用的是byType技术
	 * spring自动装配策略：AUTOWIRE_NO  AUTOWIRE_BY_NAME   AUTOWIRE_BY_TYPE   AUTOWIRE_CONSTRUCTOR
	 */

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(Config.class);
		OrderService orderService = (OrderService) context.getBean("order");
		System.out.println(orderService.getName());
		OrderService orderService1 = (OrderService) context.getBean("orderChild");
		System.out.println(orderService1.getName());

		/**
		 * 如果一个类指定了factory-method，那么spring实例化出来的对象就为factory-method返回的对象
		 */
		System.out.println(context.getBean("demoService").getClass().getName());
	}

}
