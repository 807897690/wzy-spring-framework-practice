package com.wzy.service;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName ExampleImportBeanDefinitionRegistrar
 * @Desc TODO
 * @Author Administrator
 * @Date 2019/6/28 13:51
 **/
public class ExampleImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	/**
	 * AnnotationMetadata: 当前类的注解信息
	 * BeanDefinitionRegistry： BeanDefinition注册类
	 * @param importingClassMetadata annotation metadata of the importing class
	 * @param registry current bean definition registry
	 */
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		//满足条件的bean加入到容器中
		if(registry.containsBeanDefinition("com.wzy.service.Example3") &&
				registry.containsBeanDefinition("com.wzy.service.Example4")) {
			RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Example7.class);
			registry.registerBeanDefinition("example7", rootBeanDefinition);
		}
	}
}
