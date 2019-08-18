package com.wzy.watcher.springevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author wzy
 * @title: SpringMailListener
 * @description: TODO
 * @date 2019/8/18 12:26
 */
@Component
public class SpringMailListener implements ApplicationListener<SpringMailEvent> {
	@Override
	public void onApplicationEvent(SpringMailEvent event) {
		System.out.println("mail send");
	}
}
