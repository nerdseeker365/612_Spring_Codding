package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.Employee;

public class Two_getBeans_Params_Test {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		Employee emp=null;
	//holding Spring Bean Configuration File
		 res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		//Creating IOC Container
		 factory=new XmlBeanFactory(res);
		//calling getBean Method with Two params
		emp=factory.getBean("emp",Employee.class);
		//result 
		System.out.println("Result:: -->>::  "+emp.message("Sankar"));
	}

}
