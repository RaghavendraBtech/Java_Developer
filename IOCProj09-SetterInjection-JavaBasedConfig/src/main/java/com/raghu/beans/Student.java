package com.raghu.beans;

public class Student {
	
	private Integer stdId;
	private String stdName;
	
	public Student() {
		super();
	}

	public Student(Integer stdId, String stdName) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
	}
	// setters and getters
	public Integer getStdId() {
		return stdId;
	}
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
	public void printStdDetails() {
		System.out.println(stdId);
		System.out.println(stdName);
	}

}
