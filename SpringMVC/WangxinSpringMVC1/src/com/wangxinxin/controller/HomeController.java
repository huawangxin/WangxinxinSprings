package com.wangxinxin.controller;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wangxinxin.service.SpitterService;

/**
 * ��ҳ������
 * @author huawangxin
 * 2017��8��8�� ����12:12:01
 */
/***����Ϊ������***/
@Controller
public class HomeController {
	public static final int DEFAULT_SPITTLES_PER_PAGE=25;
	
	private SpitterService spitterService;
	/***ע��SpitterService***/
	@Inject
	public HomeController(SpitterService spitterService) {
		this.spitterService=spitterService;
	}
	/***�������ҳ������***/
	@RequestMapping({"/","/home"})
	public String showHomePage(Map<String, Object> model) {
		model.put("spittles", spitterService.getRecentSpittles(DEFAULT_SPITTLES_PER_PAGE));
		return "home";
	}
	
}
