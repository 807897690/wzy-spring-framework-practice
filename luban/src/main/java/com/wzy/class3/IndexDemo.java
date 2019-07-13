package com.wzy.class3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;

/**
 * @author wzy
 * @title: IndexDemo
 * @description: BeanPostProcessor插手spring bean的实例化过程
 * @date 2019/7/13 10:45
 */
public class IndexDemo implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("indexDemo2")) {
			bean = Proxy.newProxyInstance(this.getClass().getClassLoader(),
					new Class[]{Dao.class}, new MyInvocationHandler(new IndexDemo2()));
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}
}
