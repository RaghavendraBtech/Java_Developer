package com.raghu.model;


public class Student {
	
	private Integer stdId;
	private String stdName;
	private String branch="EEE";
	private Float avg=61.49f;
	public Student() {
		super();
	}
	public Student(Integer stdId, String stdName, String branch, Float avg) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.branch = branch;
		this.avg = avg;
	}
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Float getAvg() {
		return avg;
	}
	public void setAvg(Float avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", branch=" + branch + ", avg=" + avg + "]";
	}
	

}
