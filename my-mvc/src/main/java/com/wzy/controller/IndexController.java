package com.wzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wzy
 * @title: IndexController
 * @description: TODO
 * @date 2019/8/19 11:24
 */
@Controller
public class IndexController {

	@RequestMapping("/index")
	@ResponseBody
	public String index() {
		System.out.println("index");
		return "index";
	}

}
