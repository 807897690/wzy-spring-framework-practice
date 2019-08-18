package com.wzy.watcher.springevent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wzy
 * @title: Test
 * @description: spring中提供了一个父类事件ApplicationEvent
 * 每继承该类得事件都需要传一个事件源，代表该事件在什么情况下被调用，
 * 例如new SpringMailEvent(applicationContext)代表了在spring上下文都可以调用该事件
 * 然后实现一个监听器来对应该事件，一旦该事件被出发，则监听器开始执行，
 * 例如SpringMailListener implements ApplicationListener<SpringMailEvent>
 * @date 2019/8/18 12:27
 */
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);
		applicationContext.getBean(MailBean.class).sendEmail();
	}

}
