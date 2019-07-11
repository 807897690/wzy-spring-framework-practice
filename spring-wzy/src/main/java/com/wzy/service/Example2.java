package com.wzy.service;

import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @ClassName Example2
 * @Desc TODO
 * @Author Administrator
 * @Date 2019/6/24 15:32
 **/
@Component
@Conditional(LinuxCondition.class)
public class Example2 {

	public Example2() {
		System.out.println("example2 init");
	}

}
