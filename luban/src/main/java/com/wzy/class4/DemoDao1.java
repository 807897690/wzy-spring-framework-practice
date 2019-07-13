package com.wzy.class4;

/**
 * @author wzy
 * @title: DemoDao1
 * @description: TODO
 * @date 2019/7/13 17:17
 */
public class DemoDao1 implements Dao{

	public DemoDao1() {
		System.out.println("demoDao1 init");
	}

	@Override
	public void test() {
		System.out.println("demoDao1");
	}
}
