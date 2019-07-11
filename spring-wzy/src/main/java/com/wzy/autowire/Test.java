package com.wzy.autowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wzy
 * @title: Test
 * @description: TODO
 * @date 2019/7/1 17:09
 */
public class Test {

	/**
	 * @Autowired 和 @Resource的区别：
	 * autowired默认是根据byType查找，resource默认是根据byName，如果没有设置value的值，
	 * 那么resource会根据属性名称查找，如果根据name查找不到，才会根据byType查找，resource也可以设置type类型，来根据byType查找
	 *
	 * byName分为.xml文件和@Resource两种区别：.xml是根据属性的set方法的名称查找，而Resource是根据属性名称查找
	 */

	/**
	 * @Component包含@Service、@Controller、@Repository，后面是三种可以看作是不同的类型，父类都是@Component
	 */

	/**
	 *	当一个单例bean依赖一个原型bean的时候，此时spring容器只会实例化一次单例bean，
	 *	所以即使依赖原型bean，获得的原型bean也是同一个,此时需要@Lookup注解来解决,
	 *	或者实现spring内置的接口ApplicationContextAware
	 */

	public static void main(String[] args) {
		AnnotationConfigApplicationContext configApplicationContext =
				new AnnotationConfigApplicationContext(Spring.class);
		IndexService service = (IndexService)configApplicationContext.getBean("indexService");
		service.test();

		SingletonService singletonService =
				(SingletonService)configApplicationContext.getBean(SingletonService.class);
		singletonService.service();
		SingletonService singletonService2 =
				(SingletonService)configApplicationContext.getBean(SingletonService.class);
		singletonService2.service();
	}

}
