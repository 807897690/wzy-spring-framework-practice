package com.wzy.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName BeanTest
 * @Desc TODO
 * @Author Administrator
 * @Date 2019/6/28 16:00
 **/
@Configuration
public class BeanConfig {

	@Bean(initMethod = "init", destroyMethod = "destory")
	public Bike bike() {
		return new Bike();
	}

}
