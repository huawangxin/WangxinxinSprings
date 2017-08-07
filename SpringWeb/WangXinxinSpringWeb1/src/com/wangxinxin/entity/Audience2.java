package com.wangxinxin.entity;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience2 {
	private String thoughts;
	@Pointcut("execution(* com.wangingxin.entity.Jugger.perform(String))")
	public void takeSeats(){
		System.out.println("The audience is taking their seats. ");
	}
	public void turnOffCellPhones() {
		System.out.println(" turn off cellphone ");
	}
	public void applaud() {
		System.out.println("Clap Clap Clap Clap ");
	}
	public void demandRefund() {
		System.out.println("Boo! We want our moneyt back!");
	}
}
