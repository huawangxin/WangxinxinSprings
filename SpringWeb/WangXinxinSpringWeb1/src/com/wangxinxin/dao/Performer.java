package com.wangxinxin.dao;

import com.wangxinxin.exception.PerformanceException;

public interface Performer {
	/**
	 * 表演
	 * @throws PerformanceException
	 */
	void perform() throws PerformanceException;
}
