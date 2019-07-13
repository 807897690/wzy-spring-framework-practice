package com.wzy.class3;

import org.springframework.stereotype.Component;

/**
 * @author wzy
 * @title: IndexDemo2
 * @description: TODO
 * @date 2019/7/13 10:47
 */
@Component
public class IndexDemo2 implements Dao{
	@Override
	public void test() {
		System.out.println("indexDemo2");
	}
}
