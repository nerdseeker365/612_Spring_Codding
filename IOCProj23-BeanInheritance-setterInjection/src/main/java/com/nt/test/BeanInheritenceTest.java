package com.nt.test;  

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Car;

public class BeanInheritenceTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		 Car car=null,car1=null;
		//Create IOC Container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Spring bean class objects
		/*abstract="true" cannot create object,thats why comment....
		 * car1=factory.getBean("baseCar",Car.class); System.out.println(car1);
		 * System.out.println(".....................................");
		 */
		car=factory.getBean("rajaCar", Car.class);
		System.out.println(car);
		System.out.println("------------------------------------------------");
		car1=factory.getBean("raniCar", Car.class);
		System.out.println(car1);
		System.out.println("------------------------------------------------");
	}

}
