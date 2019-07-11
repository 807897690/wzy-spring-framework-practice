package com.wzy.autowire;

import org.springframework.stereotype.Repository;

/**
 * @author wzy
 * @title: IndexDaoInpl1
 * @description: TODO
 * @date 2019/7/1 17:16
 */
@Repository
public class IndexDaoImpl1 implements  IndexDao{
	@Override
	public void test() {
		System.out.println("impl1");
	}
}
