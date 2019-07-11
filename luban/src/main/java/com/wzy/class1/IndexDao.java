package com.wzy.class1;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * @author wzy
 * @title: IndexDao
 * @description: TODO
 * @date 2019/7/10 10:43
 */
@Repository
public class IndexDao implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	public IndexDao() {
		System.out.println("indexDao construct");
	}

	@PostConstruct
	public void init() {
		System.out.println("indexDao init");
	}

	public void test() {
		System.out.println("test");
		applicationContext.getApplicationName();
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
