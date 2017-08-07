package com.wangxinxin.util;
/**
 * 单例
 * @author huawangxin
 * 2017年8月5日 下午7:11:57
 */
public class Stage {
	private Stage() {
		System.out.println("Stage实例化。");
	}
	private static class StageSingletHolder{
		static Stage instance =new Stage();
	}
	public static Stage getInstance() {
		return StageSingletHolder.instance;
	}
}
