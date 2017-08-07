package com.wangxinxin2.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private String id;

	private String name;

	private int age;

	private long createtime;

	private String status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getCreatetime() {
		return createtime;
	}

	public void setCreatetime(long createtime) {
		this.createtime = createtime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Student() {
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", createtime=" + createtime + ", status="
				+ status + "]";
	}

	public Student(String id, String name, int age, long createtime, String status) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.createtime = createtime;
		this.status = status;
	}
	
}
