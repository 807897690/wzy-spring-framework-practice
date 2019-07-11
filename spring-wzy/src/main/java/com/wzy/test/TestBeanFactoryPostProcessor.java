package com.wzy.test;

import com.wzy.service.Example2;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * @ClassName TestBeanFactoryPostProcessor
 * @Desc TODO
 * @Author Administrator
 * @Date 2019/6/24 15:33
 **/
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//		GenericBeanDefinition beanDefinition = (GenericBeanDefinition)beanFactory.getBeanDefinition("example");
//		beanDefinition.setBeanClass(Example2.class);

	}
}
