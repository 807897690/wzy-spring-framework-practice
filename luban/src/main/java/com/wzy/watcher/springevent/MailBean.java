package com.wzy.watcher.springevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author wzy
 * @title: MailBean
 * @description: TODO
 * @date 2019/8/18 12:27
 */
@Component
public class MailBean {

	@Autowired
	private ApplicationContext applicationContext;

	public void sendEmail() {
		applicationContext.publishEvent(new SpringMailEvent(applicationContext));
	}

}
