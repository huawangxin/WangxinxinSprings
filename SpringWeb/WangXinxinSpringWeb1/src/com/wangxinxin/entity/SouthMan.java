package com.wangxinxin.entity;

import com.wangxinxin.dao.People;
/**
 * 南方人
 * @author huawangxin
 * 2017年8月3日 下午11:30:49
 */
public class SouthMan implements People {

	@Override
	public void eat() {
		System.out.println("南方人喜欢吃饭");
	}

	@Override
	public void drink() {
		System.out.println("南方人喜欢喝茶");
	}

}
