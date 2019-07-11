package com.wzy.class1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author wzy
 * @title: MyBeanFactoryPostProcessor
 * @description: TODO
 * @date 2019/7/10 17:47
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AnnotatedBeanDefinition beanDefinition =
				(AnnotatedBeanDefinition) beanFactory.getBeanDefinition("indexDao");
		beanDefinition.setScope("prototype");
	}
}
