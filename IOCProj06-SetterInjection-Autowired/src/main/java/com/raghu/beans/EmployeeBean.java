package com.raghu.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeBean {
	
	private Integer empId;
	private String empName;
	@Autowired
	private AddresBean addr;
	
	public EmployeeBean() {
		super();
	}
	
	public EmployeeBean(Integer empId, String empName, AddresBean addr) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.addr = addr;
	}

	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public AddresBean getAddr() {
		return addr;
	}
	public void setAddr(AddresBean addr) {
		this.addr = addr;
	}
	
	public void printEmpDetails() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(addr);
	}
}
