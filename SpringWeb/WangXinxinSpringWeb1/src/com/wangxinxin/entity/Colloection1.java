package com.wangxinxin.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colloection1 {

	private List list1;
	
	private Set<NorthMan> set1;
	
	private String[] test1;
	
	private NorthMan[] northMans;

	private Map<String, NorthMan> map1;

	private Map<String, String> map2;
	
	public Map<String, String> getMap2() {
		return map2;
	}

	public void setMap2(Map<String, String> map2) {
		this.map2 = map2;
	}

	public Map<String, NorthMan> getMap1() {
		return map1;
	}

	public void setMap1(Map<String, NorthMan> map1) {
		this.map1 = map1;
	}

	public List getList1() {
		return list1;
	}

	public void setList1(List list1) {
		this.list1 = list1;
	}

	public Set<NorthMan> getSet1() {
		return set1;
	}

	public void setSet1(Set<NorthMan> set1) {
		this.set1 = set1;
	}

	public String[] getTest1() {
		return test1;
	}

	public void setTest1(String[] test1) {
		this.test1 = test1;
	}

	public NorthMan[] getNorthMans() {
		return northMans;
	}

	public void setNorthMans(NorthMan[] northMans) {
		this.northMans = northMans;
	}
	
}
