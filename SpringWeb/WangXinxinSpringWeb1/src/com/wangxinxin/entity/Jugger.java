package com.wangxinxin.entity;

import com.wangxinxin.dao.Performer;
import com.wangxinxin.exception.PerformanceException;

public class Jugger implements Performer {

	private int beanBags=3;

	public Jugger() {
		System.out.println("Jugger默认构造器");
	}
	
	public Jugger(int beanBags) {
		this.beanBags = beanBags;
	}
	
	@Override
	public void perform() throws PerformanceException {
		System.out.println("Jugger有 "+beanBags+" beannbags");
	}

}
