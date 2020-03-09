package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class ConstructorInjection {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		WishMessageGenerator generator=null;
		// Holding Spring Bean Configuration File
		 res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//Creating Spring Bean Object
		 factory=new XmlBeanFactory(res);
		generator=(WishMessageGenerator) factory.getBean("wmg");
		System.out.println("result is::"+generator.generateWishMessage("Surendra"));
	}

}
