package com.wzy.service;

import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName ExampleFactoryBean
 * @Desc TODO
 * @Author Administrator
 * @Date 2019/6/28 14:12
 **/
public class ExampleFactoryBean implements FactoryBean<Example3> {

	public ExampleFactoryBean() {
		System.out.println("ExampleFactoryBean init");
	}

	@Override
	public Example3 getObject() throws Exception {
		return new Example3();
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
