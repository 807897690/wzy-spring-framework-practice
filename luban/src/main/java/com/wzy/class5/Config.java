package com.wzy.class5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

/**
 * @author wzy
 * @title: Config
 * @description: TODO
 * @date 2019/7/20 9:55
 */
@Configuration
@ComponentScan("com.wzy.class5")
@ImportResource("spring.xml")
//@EnableAspectJAutoProxy
public class Config {
}
