package com.wzy.class2;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wzy
 * @title: MyFactoryBean
 * @description: TODO
 * @date 2019/7/12 14:39
 */
public class MyFactoryBean implements FactoryBean, InvocationHandler {

	private Class clazz;

	public MyFactoryBean(Class clazz) {
		this.clazz = clazz;
	}

	@Override
	public Object getObject() throws Exception {
		Object proxy = (Proxy) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{clazz}, this);
		return proxy;
	}

	@Override
	public Class<?> getObjectType() {
		return clazz;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("proxy");
		Method method1 = proxy.getClass().getInterfaces()[0].getMethod(method.getName(), String.class);
		if(method1.isAnnotationPresent(Selector.class)) {
			Selector selector = method1.getAnnotation(Selector.class);
			System.out.println(selector.value());
		}
		return null;
	}
}
