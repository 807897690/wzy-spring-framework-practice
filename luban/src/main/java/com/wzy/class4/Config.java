package com.wzy.class4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author wzy
 * @title: Config
 * @description: 不加@Configuration注解，下面会实例化两次DemoDao1
 * 方法上加static也会实例化两次
 * @date 2019/7/13 17:18
 */
@Configuration
@ComponentScan("com.wzy.class4")
public class Config {

	@Bean
	public static DemoDao1 demoDao1() {
		return new DemoDao1();
	}

	@Bean
	public DemoDao2 demoDao2() {
		demoDao1();
		return new DemoDao2();
	}

}
