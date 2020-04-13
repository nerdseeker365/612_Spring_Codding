package com.nt.dto;

import java.io.Serializable;

//DTO to transfer data one class to another ,one project to another project
//java bean class
public class StudentDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// bean properties
	private int stdNo;
	private String stdName;
	private String stdAddr;
	private int stdM1;
	private int stdM2;
	private int stdM3;
	//setters and getters
	public int getStdNo() {
		return stdNo;
	}
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdAddr() {
		return stdAddr;
	}
	public void setStdAddr(String stdAddr) {
		this.stdAddr = stdAddr;
	}
	public int getStdM1() {
		return stdM1;
	}
	public void setStdM1(int stdM1) {
		this.stdM1 = stdM1;
	}
	public int getStdM2() {
		return stdM2;
	}
	public void setStdM2(int stdM2) {
		this.stdM2 = stdM2;
	}
	public int getStdM3() {
		return stdM3;
	}
	public void setStdM3(int stdM3) {
		this.stdM3 = stdM3;
	}

	
	
}
