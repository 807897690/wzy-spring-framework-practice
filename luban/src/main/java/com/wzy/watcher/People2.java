package com.wzy.watcher;

/**
 * @author wzy
 * @title: People1
 * @description: TODO
 * @date 2019/8/18 11:03
 */
public class People2 implements MovieListener{
	@Override
	public void hand(MovieEvent event) {
		if(event.getType() == 1) {
			System.out.println("smile");
		}
	}
}
