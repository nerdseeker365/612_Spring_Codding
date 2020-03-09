package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	//variable declaration
	private Date date;
	//one parameter Constructor 
	public WishMessageGenerator(Date date) {
		System.out.println(date);
		System.out.println("WishMessageGenerator one parameter constructor::");
		this.date=date;
	}
	//Business Method
	public String generateWishMessage(String user) {
		System.out.println(date);
		int hour=0;
		//Hour of the Day
		hour=date.getHours();
		if(hour<12)
			return "Good Morning:: "+user;
		else if(hour<16)
			return "Good Aftre Noon:: "+user;
		else if(hour<20)
			return "Good Evening:: "+user;
		else 
			return "Good Night:: "+user;    	 
	}

}
