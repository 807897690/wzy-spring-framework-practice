package com.wzy.test;

import com.wzy.service.WindowCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserService
 * @Desc TODO
 * @Author Administrator
 * @Date 2019/6/24 14:19
 **/
@Service
@Conditional(WindowCondition.class)
public class UserService {

	public void query() {
		System.out.println("query");
	}
}
