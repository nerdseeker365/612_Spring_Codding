package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	//variable declaration
	private Date date=null;
	//setter Method
	public WishMessageGenerator() {
		// TODO Auto-generated constructor stub
		System.out.println("zero param Constructor>>>>>>>>>>");
	}
	public void setDate(Date date) {
		System.out.println(date);
		System.out.println("WishMessageGenerator Setter");
		this.date = date;
	}
	//one param COnstructor
	public WishMessageGenerator(Date date) {
		System.out.println(date);
		// TODO Auto-generated constructor stub
		System.out.println("WishMessageGenerator one param Constructor");
		this.date=date;
	}
	//Business Logic
	public String GenerateWishMessage(String user) {
		int hour=0;
		//getting correct hour of the Day
		hour=date.getHours();
		//generate wish Message Based on time
		if(hour<12) {
			return "Good Morning::--->>>>>> "+user;
		}
		else if(hour<16) {
			return "Good After Noon::--->>>>>> "+user;
		}
		else if(hour<20) {
			return "Good Evening::--->>>>>> "+user;
		}
		else {
			return "Good Nigght:: --->>>>>>"+user;
		}
	}
	

}
