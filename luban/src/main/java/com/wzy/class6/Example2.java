package com.wzy.class6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author wzy
 * @title: Example2
 * @description: TODO
 * @date 2019/7/22 14:39
 */
@Component
public class Example2 {

	@Autowired
	private Example1 example1;

}
