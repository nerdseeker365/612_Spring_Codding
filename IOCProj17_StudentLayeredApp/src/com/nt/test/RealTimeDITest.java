package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.controller.MainController;
import com.nt.vo.StudentVO;

@SuppressWarnings("deprecation")
public class RealTimeDITest {


	@SuppressWarnings("null")
	public static void main(String[] args) {
		String stdNo=null;
		String stdName=null;
		String stdAddr=null;
		String stdM1=null;
		String stdM2=null;
		String stdM3=null;
		BeanFactory factory=null;
		Scanner sc=null;
		StudentVO vo=null;
		String result=null;
		//create IOC Container
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//Reading Inputs 
		sc=new Scanner(System.in);
		System.out.println("Enter Student Number:: ");
		stdNo=sc.next();
		System.out.println("Enter Student Name:: ");
		stdName=sc.next();
		System.out.println("Enter Student Address:: ");
		stdAddr=sc.next();
		System.out.println("Enter Student M1 Marks:: ");
		stdM1=sc.next();
		System.out.println("Enter Student M2 Marks:: ");
		stdM2=sc.next();
		System.out.println("Enter Student M3 Marks:: ");
		stdM3=sc.next();
		//create VO class Object Inputs as Strings
		vo=new StudentVO();
		vo.setStdNo(stdNo);
		vo.setStdName(stdName);
		vo.setStdAddr(stdAddr);
		vo.setStdM1(stdM1);
		vo.setStdM2(stdM2);
		vo.setStdM3(stdM3);
		//get Controller class Object
		MainController controller=factory.getBean("control",MainController.class);
		try {
			//Invoke Methods 
			result=controller.handler(vo);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
