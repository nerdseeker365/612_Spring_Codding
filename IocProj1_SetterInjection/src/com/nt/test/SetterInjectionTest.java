package com.nt.test;
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
		//get Bean
		//Object obj=factory.getBean("wmg1");
		wish=(WishMessageGenerator) factory.getBean("wmg");
		
		System.out.println("---->Result::"+wish.generateWishMessage("Raju"));
	}

}
