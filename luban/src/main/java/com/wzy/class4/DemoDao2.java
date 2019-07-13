package com.wzy.class4;

/**
 * @author wzy
 * @title: DemoDao2
 * @description: TODO
 * @date 2019/7/13 17:17
 */
public class DemoDao2 implements Dao{

	public DemoDao2() {
		System.out.println("demoDao2 init");
	}

	@Override
	public void test() {
		System.out.println("demoDemo2");
	}
}
