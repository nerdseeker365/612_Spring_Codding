package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.EnggCourse;

public class CollectionMergingTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		EnggCourse engg=null,engg1=null;
		//create IOC Container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Bean
		engg=factory.getBean("ece",EnggCourse.class);
		System.out.println(engg);
		System.out.println("-------------------------------------");
		engg1=factory.getBean("cse",EnggCourse.class);
		System.out.println(engg1);
		System.out.println("-------------------------------------");
	}

}
