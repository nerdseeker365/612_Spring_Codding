package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.PersonProfile;

public class DefaultBeanIdsTest {

	public static void main(String[]  args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		PersonProfile person=null,person1=null,person2=null;
		//Create IOC Container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Bean
		//person=factory.getBean("com.nt.beans.PersonProfile",PersonProfile.class);
		//or
		person=factory.getBean("com.nt.beans.PersonProfile#0",PersonProfile.class);
		System.out.println(person);
		System.out.println("------------------------------------------------");
		person1=factory.getBean("com.nt.beans.PersonProfile#1",PersonProfile.class);
		System.out.println(person1);
		System.out.println("------------------------------------------------");
		person2=factory.getBean("com.nt.beans.PersonProfile#2",PersonProfile.class);
		System.out.println(person2);
		System.out.println("------------------------------------------------");
	}

}
