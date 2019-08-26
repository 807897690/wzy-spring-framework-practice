package com.wzy.property_source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author wzy
 * @title: AppConfig
 * @description: TODO
 * @date 2019/8/21 16:33
 */
@Configuration
@PropertySource("classpath:property_source.properties")
public class AppConfig {

	@Autowired
	private Environment env;
}
