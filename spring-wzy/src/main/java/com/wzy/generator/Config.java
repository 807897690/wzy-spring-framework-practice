package com.wzy.generator;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author wzy
 * @title: COnfig
 * @description: TODO
 * @date 2019/7/1 21:20
 */
@Configuration
@ComponentScan(value = "com.wzy.generator", nameGenerator = MyBeanNameDenerator.class)
public class Config {
}
