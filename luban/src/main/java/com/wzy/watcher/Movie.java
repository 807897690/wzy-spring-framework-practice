package com.wzy.watcher;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author wzy
 * @title: Movie
 * @description: TODO
 * @date 2019/8/18 11:04
 */
public class Movie implements Runnable{

	private List<MovieListener> listenerList = new ArrayList();

	public void addListener(MovieListener listener) {
		this.listenerList.add(listener);
	}

	@Override
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MovieEvent event = new MovieEvent();
		event.setType(1);
		event.setContent("事件发生");
		for (MovieListener movieListener : listenerList) {
			movieListener.hand(event);
		}
	}
}
