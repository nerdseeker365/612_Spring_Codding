package com.nt.beans;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.ToString;
@AllArgsConstructor
@ToString
public class PersonProfile {
	private long aadharNo;
	private String name;
	private int age;
	private Date dob,doj,dom;

}
