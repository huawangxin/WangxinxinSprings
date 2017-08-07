package com.wangxinxin.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.wangxinxin.entity.Colloection1;
import com.wangxinxin.entity.Jugger;
import com.wangxinxin.entity.NorthMan;
import com.wangxinxin.entity.SouthMan;
import com.wangxinxin.exception.PerformanceException;
import com.wangxinxin.util.Stage;
import com.wangxinxin2.service.impl.StudentServiceImpl;
/**
 * people测试类
 * @author huawangxin
 * 2017年8月3日 下午11:38:19
 */
public class TestPeople {

	public static void main(String[] args) {
		new TestPeople().getStudent();
	}
	public void getStudent() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Spring-JDBC.xml");
	    System.out.println(StudentServiceImpl.getInstance());
	    System.out.println(((StudentServiceImpl) ac).getJdbcTemplate());
	}
	public void getList(){
		//利用文件系统查找application文件
		ApplicationContext ac = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		Colloection1 colloection1 =   (Colloection1) ac.getBean("colloection1");
		System.out.println(colloection1.getNorthMans());
		System.out.println(colloection1.getSet1());
		System.out.println(colloection1.getMap1());
		System.out.println(colloection1.getMap2());
	}
	public void getTheStage(){
		//利用文件系统查找application文件
		ApplicationContext ac = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		Stage stage =   (Stage) ac.getBean("theStage");
//		stage.getInstance();
	}
	public void getTestDugger(){
		//利用文件系统查找application文件
		ApplicationContext ac = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		//利用类路径查找application文件
		//ApplicationContext ac = new FileSystemXmlApplicationContext("applicationContext.xml");
		Jugger n = (Jugger) ac.getBean("jugger");
		try {
			n.perform();
		} catch (PerformanceException e) {
			e.printStackTrace();
		}
	}
	public void getTestPeople() {
		//利用文件系统查找application文件
		ApplicationContext ac = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		//利用类路径查找application文件
		//ApplicationContext ac = new FileSystemXmlApplicationContext("applicationContext.xml");
		NorthMan n = (NorthMan) ac.getBean("northMan");
		n.eat();
		n.drink();
		SouthMan s = (SouthMan) ac.getBean("southMan");
		s.eat();
		s.drink();
	}
}
