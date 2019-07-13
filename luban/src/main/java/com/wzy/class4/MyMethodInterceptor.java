package com.wzy.class4;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author wzy
 * @title: MyMethodInterceptor
 * @description: 自定义方法拦截
 * @date 2019/7/13 17:22
 */
public class MyMethodInterceptor implements MethodInterceptor {

	/**
	 *
	 * @param o  代理对象
	 * @param method  目标方法
	 * @param objects  参数
	 * @param methodProxy  代理方法
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("代理方法");
		return methodProxy.invokeSuper(o, objects);
	}
}
