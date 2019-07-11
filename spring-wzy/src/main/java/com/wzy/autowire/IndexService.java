package com.wzy.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wzy
 * @title: IndexService
 * @description: TODO
 * @date 2019/7/1 17:09
 */
@Service
public class IndexService {

//	@Autowired   会报错，因为有两个实现类，
//	No qualifying bean of type 'com.wzy.autowire.IndexDao' available: expected single matching bean but found 2: indexDaoImpl,indexDaoImpl1

//	@Resource  也会报错，因为根据name查找不到，然后根据byType查找，错误跟上面一样
//	private IndexDao indexDao;

	@Resource
	private IndexDao indexDaoImpl;

	public void test() {
		indexDaoImpl.test();
	}

}
