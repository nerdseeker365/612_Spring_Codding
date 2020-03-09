package com.nt.beans;

import java.util.Date;

public class Employee {
public Employee(int eid,String ename,String ecity) {
	Address d=new Address();
	d.eid=eid;
	d.ename=ename;
	d.ecity=ecity;
	System.out.println(eid+"\t"+ename+"\t"+ecity);
}
public String message(String user) {
	return user;
}
}
