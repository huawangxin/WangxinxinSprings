package com.wangxinxin.entity;

import com.wangxinxin.dao.People;
/**
 * 北方人
 * @author huawangxin
 * 2017年8月3日 下午11:29:41
 */
public class NorthMan implements People{
	private Sonnet29 sonnet29;
	private String a;
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	
	public Sonnet29 getSonnet29() {
		return sonnet29;
	}
	public void setSonnet29(Sonnet29 sonnet29) {
		this.sonnet29 = sonnet29;
	}
	@Override
	public void eat() {
		System.out.println("北方人喜欢吃面食");
	}

	@Override
	public void drink() {
		System.out.println("北方人喜欢喝酒");
	}

}
