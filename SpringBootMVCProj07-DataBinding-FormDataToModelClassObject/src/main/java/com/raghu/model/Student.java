package com.raghu.model;

public class Student {
	 private Integer stdId;
	 private String stdName;
	 private String addr;
	 private Float avg;
	public Student() {
		super();
	}
	public Student(Integer stdId, String stdName, String addr, Float avg) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.addr = addr;
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Float getAvg() {
		return avg;
	}
	public void setAvg(Float avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", addr=" + addr + ", avg=" + avg + "]";
	}
	
	 

}
