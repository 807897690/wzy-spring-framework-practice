package com.wzy.class1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @author wzy
 * @title: MyBeanPostProcessor1
 * @description: TODO
 * @date 2019/7/10 14:15
 */
@Component
public class MyBeanPostProcessor2 implements BeanPostProcessor, PriorityOrdered {
	@Override
	public int getOrder() {
		return 102;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean.getClass().getSimpleName().equals("IndexDao")) {
			System.out.println("MyBeanPostProcessor2 before  test");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(bean.getClass().getSimpleName().equals("IndexDao")) {
			System.out.println("MyBeanPostProcessor2 after test");
		}
		return bean;
	}
}
