package com.wzy.service;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @ClassName WindowCondition
 * @Desc TODO
 * @Author Administrator
 * @Date 2019/6/27 16:26
 **/
public class WindowCondition implements Condition {

	/**
	 *
	 * @param context the condition context  判断条件可以使用的上下文（环境）
	 * @param metadata metadata of the {@link org.springframework.core.type.AnnotationMetadata class}
	 * or {@link org.springframework.core.type.MethodMetadata method} being checked  注解信息
	 * @return
	 */
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		//是否为WINDOWS系统
		//能获取到IOC正在使用的beanFactory
		ConfigurableListableBeanFactory configurableListableBeanFactory = context.getBeanFactory();
		Environment environment = context.getEnvironment();
		String osName = environment.getProperty("os.name");
		System.out.println("当前操作系统名称:"+osName);
		if(osName.contains("Windows")) {
			return true;
		}
		return false;
	}
}
