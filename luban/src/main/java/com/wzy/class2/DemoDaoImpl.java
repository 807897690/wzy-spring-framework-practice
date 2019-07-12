package com.wzy.class2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author wzy
 * @title: DemoDaoImpl
 * @description: TODO
 * @date 2019/7/12 14:42
 */
@Component
public class DemoDaoImpl {

	@Autowired
	private DemoDao demoDao;

	public void test() {
		demoDao.test("aads");
		System.out.println("demoDaoImpl");
	}

}
