package com.wzy.class1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wzy
 * @title: TestDemo
 * @description: TODO
 * @date 2019/7/10 9:34
 */
public class TestDemo {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(Config.class);
//		context.register(IndexDao.class);
//		context.refresh();
//		IndexDao indexDao = context.getBean(IndexDao.class);
//		IndexDao indexDao1 = context.getBean(IndexDao.class);
//		System.out.println(indexDao == indexDao1);

	}

}
