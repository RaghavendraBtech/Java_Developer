package com.raghu.beans;

public class Employee {
	private Integer empId;
	private String empName;
	private String email;
	private Double sal;
	
	public Employee() {
	}
	public Employee(Integer empId, String empName, String email, Double sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.sal = sal;
	}
	// setter method supporting setter injection 
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}
	
	public void printEmpDetails() {
		System.out.println("empId=" + empId + " empName=" + empName + " email=" + email + " sal=" + sal );
	}
	

}
