package com.wzy.class2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wzy
 * @title: Test
 * @description: TODO
 * @date 2019/7/12 14:45
 */
public class Test {

	/**
	 * ImportBeanDefinitionRegistrar 实现该接口，可以动态的向spring容器中添加BeanDefinition
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(Config.class);
//		DemoDao demoDao = (DemoDao) context.getBean("demoDao");
//		demoDao.test("asdsad");
		DemoDaoImpl impl = context.getBean(DemoDaoImpl.class);
		impl.test();
	}

}
