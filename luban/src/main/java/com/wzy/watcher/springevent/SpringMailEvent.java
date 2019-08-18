package com.wzy.watcher.springevent;

import org.springframework.context.ApplicationEvent;

/**
 * @author wzy
 * @title: SpringMailEvent
 * @description: TODO
 * @date 2019/8/18 12:26
 */
public class SpringMailEvent extends ApplicationEvent {
	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */
	public SpringMailEvent(Object source) {
		super(source);
	}
}
