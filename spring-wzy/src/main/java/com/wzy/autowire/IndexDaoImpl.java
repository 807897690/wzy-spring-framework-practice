package com.wzy.autowire;

import org.springframework.stereotype.Repository;

/**
 * @author wzy
 * @title: IndexDao
 * @description: TODO
 * @date 2019/7/1 17:07
 */
@Repository
public class IndexDaoImpl implements IndexDao{

	@Override
	public void test() {
		System.out.println("impl");
	}
}
