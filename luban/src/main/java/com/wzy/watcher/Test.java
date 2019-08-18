package com.wzy.watcher;

/**
 * @author wzy
 * @title: Test
 * @description: java观察者模式
 * @date 2019/8/18 11:06
 */
public class Test {

	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.addListener(new People1());
		movie.addListener(new People2());
		Thread thread = new Thread(movie);
		thread.start();
	}

}
