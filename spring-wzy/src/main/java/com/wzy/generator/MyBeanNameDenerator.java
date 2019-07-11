package com.wzy.generator;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * @author wzy
 * @title: MyBeanNameDenerator
 * @description: 自定义beanName的规则
 * @date 2019/7/1 20:44
 */
public class MyBeanNameDenerator implements BeanNameGenerator {
	@Override
	public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
		String className = definition.getBeanClassName();
		System.out.println("beanClassName:"+className);
		return className;
	}
}
