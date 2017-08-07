package com.wangxinxin.entity;

import com.wangxinxin.dao.Poem;
import com.wangxinxin.exception.PerformanceException;

public class PoeticJugger extends Jugger {
	private Poem poem;
	public PoeticJugger(Poem poem) {
		super();
		this.poem = poem;
	}
	public PoeticJugger(int beanBags,Poem poem) {
		super(beanBags);
		this.poem = poem;
	}
	public void perform() throws PerformanceException{
		super.perform();
		System.out.println("While reciting...");
		poem.recite();
	}
}
