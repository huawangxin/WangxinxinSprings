package com.wangxinxin.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.wangxinxin.dao.Poem;

public class Sonnet29 implements Poem ,InitializingBean,DisposableBean{
	private static String[] LINES= {"1","2","3"};
	public Sonnet29() {
		
	}
	@Override
	public void recite() {
		for(int i=0;i<LINES.length;i++) {
			System.out.println(LINES[i]);
		}
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("初始化方法");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("销毁方法");
	}
	
}
