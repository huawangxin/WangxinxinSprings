package com.wangxinxin.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * 配置类
 * @author huawangxin
 * 2017年8月6日 下午1:51:06
 */
@Configuration
public class SpringIdolConfig {
	@Bean
	public NorthMan northMan() {
		return new NorthMan();
	}
}
