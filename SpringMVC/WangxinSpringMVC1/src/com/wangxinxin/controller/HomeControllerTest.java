package com.wangxinxin.controller;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import com.wangxinxin.entity.Spitter;
import com.wangxinxin.service.SpitterService;

public class HomeControllerTest {
	@Test
	public void shouldDisplayRecentSpittles(){
		/**
		 * 模拟SpitterService
		 */
		List<Spitter> expectedSpittles = asList(new Spitter(),new Spitter(),new Spitter());
		SpitterService spitterService = mock(SpitterService.class);	
		when(spitterService.getRecentSpittles(HomeController.DEFAULT_SPITTLES_PER_PAGE)).
				thenReturn(expectedSpittles);
		/**
		 * 创建控制器
		 */
		HomeController controller=new HomeController(spitterService);
		HashMap<String, Object> model=new HashMap<String,Object>();
		/**
		 * 调用处理方法
		 */
		String viewName= controller.showHomePage(model);
		/**
		 * 对结果进行断言
		 */
		assertEquals("home",viewName);
		assertSame(expectedSpittles,model.get("spittles"));
		verify(spitterService).getRecentSpittles(HomeController.DEFAULT_SPITTLES_PER_PAGE);
	}
	
}
