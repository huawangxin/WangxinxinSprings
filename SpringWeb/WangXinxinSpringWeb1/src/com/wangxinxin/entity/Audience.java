package com.wangxinxin.entity;

import org.springframework.stereotype.Component;

@Component
public class Audience {
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
