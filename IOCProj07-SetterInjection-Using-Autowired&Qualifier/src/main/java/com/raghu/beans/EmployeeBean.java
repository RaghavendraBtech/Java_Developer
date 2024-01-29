package com.raghu.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



public class EmployeeBean {
	
	private int empId;
	private String empName;
	@Autowired
	@Qualifier("ta")
	private AddressBean addr;
	public EmployeeBean() {
		super();
	}
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public AddressBean getAddr() {
		return addr;
	}
	public void setAddr(AddressBean addr) {
		this.addr = addr;
	}
	public void printEmployee() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(addr);
	}

}
