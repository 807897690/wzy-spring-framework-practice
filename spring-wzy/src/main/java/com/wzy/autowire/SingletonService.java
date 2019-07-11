package com.wzy.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

/**
 * @author wzy
 * @title: SingletonDemo
 * @description: TODO
 * @date 2019/7/1 17:44
 */
@Service
public abstract class SingletonService {

//	@Autowired  此时下面获取hashCode的方法的值是一样的，因为由于SingletonService是单例的，
//	它只会被Spring容器创建一次，所以prototypeDao也只被实例化一次
//	private PrototypeDao prototypeDao;

	@Lookup
	public abstract PrototypeDao getDao();

	public void service() {
		System.out.println("service:"+this.hashCode());
//		System.out.println("dao :" + prototypeDao.hashCode());
		System.out.println("dao:"+getDao().hashCode());
	}

}
