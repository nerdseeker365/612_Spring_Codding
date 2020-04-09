package com.nt.test;
import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		WishMessageGenerator wish=null;
		//Holding file location
		Resource res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//Creating IOC Container
		BeanFactory factory=new XmlBeanFactory(res);
		//get Bea
		wish= factory.getBean("wmg",WishMessageGenerator.class);
		System.out.println("---->Result::"+wish.generateWishMessage("sankar"));
		System.out.println("--------------------------------------------");
		
		wish= factory.getBean("n",WishMessageGenerator.class);
		System.out.println("---->Result::"+wish.generateWishMessage("sankar"));
		System.out.println("--------------------------------------------");
		
		wish= factory.getBean("k",WishMessageGenerator.class);
		System.out.println("---->Result::"+wish.generateWishMessage("sankar"));
		System.out.println("--------------------------------------------");
	}

}
