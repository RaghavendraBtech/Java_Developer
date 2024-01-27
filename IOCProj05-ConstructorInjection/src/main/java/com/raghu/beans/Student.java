package com.raghu.beans;

public class Student {
	private Integer stdId;
	private String stdName;
	private Integer sub1;
	private Integer sub2;
	private Integer sub3;
	
	// for constructor injection
	public Student(Integer stdId, String stdName, Integer sub1, Integer sub2, Integer sub3) {
		System.out.println("Student.Student():: 5-param construcor");
		this.stdId = stdId;
		this.stdName = stdName;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	// b.method
	public void printStudentDetails() {
		int total=sub1+sub2+sub3;
		float avg=total/3;
		char grade;
		if(avg>=70)
			grade='A';
		else if(avg>=50)
			grade='B';
		else if(avg>=35)
			grade='C';
		else
			grade='D';
		System.out.println("StudentId: "+stdId+"\n"+"StudentName: "+stdName+"\n"+"Sub1: "+sub1+"\n"+"Sub2: "+sub2+
				"\n"+"Sub3: "+sub3);
		System.out.println("Total: "+total);
		System.out.println("Average:"+ avg);
		System.out.println("Grade: "+grade);
	}

}
