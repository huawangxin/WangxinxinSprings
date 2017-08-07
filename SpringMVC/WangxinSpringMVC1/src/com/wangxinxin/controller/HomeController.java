package com.wangxinxin.controller;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wangxinxin.service.SpitterService;

/**
 * 首页控制器
 * @author huawangxin
 * 2017年8月8日 上午12:12:01
 */
/***声明为控制器***/
@Controller
public class HomeController {
	public static final int DEFAULT_SPITTLES_PER_PAGE=25;
	
	private SpitterService spitterService;
	/***注入SpitterService***/
	@Inject
	public HomeController(SpitterService spitterService) {
		this.spitterService=spitterService;
	}
	/***处理对首页的请求***/
	@RequestMapping({"/","/home"})
	public String showHomePage(Map<String, Object> model) {
		model.put("spittles", spitterService.getRecentSpittles(DEFAULT_SPITTLES_PER_PAGE));
		return "home";
	}
	
}
