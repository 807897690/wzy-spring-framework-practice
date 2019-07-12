package com.wzy.class2;

import org.springframework.stereotype.Component;

/**
 * @author wzy
 * @title: DemoDao
 * @description: TODO
 * @date 2019/7/12 14:41
 */
public interface DemoDao {

	@Selector("select * from user where user_id = ?")
	public void test(String str);

}
