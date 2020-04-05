package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.PersonProfile;

public class DefaultBeanIdsTest {

	public static void main(String[]  args) {
		PersonProfile person=null,person1=null,person2=null;
			BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		//get Bean
		//person=factory.getBean("com.nt.beans.PersonProfile",PersonProfile.class);
		//or
		person=factory.getBean("raja",PersonProfile.class);
		System.out.println(person);
		System.out.println("------------------------------------------------");
		person1=factory.getBean("rani",PersonProfile.class);
		System.out.println(person1);
		System.out.println("------------------------------------------------");
		person2=factory.getBean("suresh",PersonProfile.class);
		System.out.println(person2);
		System.out.println("------------------------------------------------");
	}

}
