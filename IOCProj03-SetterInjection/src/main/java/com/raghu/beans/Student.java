package com.raghu.beans;

public class Student {
	private Integer stdId;
	private String stdName;
	private Address addr;
	
	

	// setter method supporting setter injection 
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	//B.method
	public void printStudentDetails() {
		System.out.println("StudentId="+ stdId+"\n"+"StudentName="+ stdName+"\n"+ addr);
	}
}
