package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.MessageService;

public class Test {
	
	public static void main(String[] args) {
		BeanFactory factory=null;
		MessageService service=null;
		MessageService service1=null;
		 factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		service=(MessageService) factory.getBean("ms");
		System.out.println(service.getMessage());
		System.out.println("----------------------------------------------------");
		
		service1=(MessageService) factory.getBean("ms1");
		System.out.println(service1.getMessage());
	}

}
