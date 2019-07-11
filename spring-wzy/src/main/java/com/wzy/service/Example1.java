package com.wzy.service;

import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @ClassName Example1
 * @Desc TODO
 * @Author Administrator
 * @Date 2019/6/24 15:31
 **/
@Component()
@Conditional(WindowCondition.class)
public class Example1 {

	public Example1() {
		System.out.println("example1 init");
	}
}
