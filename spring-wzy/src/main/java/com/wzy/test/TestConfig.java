package com.wzy.test;

import com.wzy.service.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Service;

/**
 * @ClassName TestConfig
 * @Desc TODO
 * @Author Administrator
 * @Date 2019/6/24 15:30
 **/
@Configuration
@ComponentScan(value = "com.wzy.*" /*,includeFilters = {
		@Filter(type = FilterType.CUSTOM, classes = {CustomFilter.class})
}, useDefaultFilters = false*/)
@Import(value = {Example4.class, ExampleImportSelecor.class, ExampleImportBeanDefinitionRegistrar.class})
public class TestConfig {

	@Bean
	public ExampleFactoryBean exampleFactoryBean() {
		return new ExampleFactoryBean();
	}

}
