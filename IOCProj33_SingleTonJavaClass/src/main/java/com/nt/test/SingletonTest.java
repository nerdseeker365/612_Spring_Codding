package com.nt.test;

import com.nt.singleton.Printer;

public class SingletonTest {

	public static void main(String[] args) {
		Printer p1=null,p2=null;
		
		p1=Printer.getInstance();
		p2=Printer.getInstance();
		System.out.println("p1==p2?"+(p1==p2));
		System.out.println("----------------------------------");
		System.out.println(p1.hashCode()+"/t"+p1.hashCode());
		System.out.println("---------------------------------------");
		p1.printMessage("hai::-->>   ");
		p2.printMessage("hello::-->> ");
	}

}
