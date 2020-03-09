package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class TestFileConfi {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		WishMessageGenerator wish=null;
		//holding Spring Bean Configuration File
		//res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		res=new ClassPathResource("com/nt/cfgs/applicationContext1.xml");
		//res=new ClassPathResource("applicationContext.xml");
		//must and should place in build paththis file applicationContext.xml
		//Creating Spring IOC Container
		factory=new XmlBeanFactory(res);
		//Getting Object
		//DownCasting
		wish=(WishMessageGenerator) factory.getBean("wms");
		//result
		System.out.println("the end ");
	}

}
