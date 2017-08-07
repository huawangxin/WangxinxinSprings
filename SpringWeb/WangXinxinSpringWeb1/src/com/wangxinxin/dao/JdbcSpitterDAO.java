package com.wangxinxin.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.wangxinxin.entity.NorthMan;

public class JdbcSpitterDAO implements SpitterDAO {
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void addSpitter(NorthMan northMan){
		jdbcTemplate.update("insert into northMan value (?) ",northMan.getA());
	}
}
