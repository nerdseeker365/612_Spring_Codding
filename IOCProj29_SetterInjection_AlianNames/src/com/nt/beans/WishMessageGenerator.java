package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	//Bean Properties
	private Date date=null;
	//Setter Method
	public void setDate(Date date) {
		this.date=date; 
	}
	//Business Logic 
	public String generateWishMessage(String user) {
		//date 
		System.out.println(date);
		int hour=date.getHours();
		if(hour<12)
			return "Good Morning:: "+user;
		else if(hour<16)
			return "Good AfterNoon:: "+user;
		else if(hour<20)
			return "Good Evening:: "+user;
		else
		return "Good Night:: "+user;
	}

}
