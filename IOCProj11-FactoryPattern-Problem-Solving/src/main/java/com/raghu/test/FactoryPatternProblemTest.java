package com.raghu.test;

import com.raghu.comp.AadharDetails;
import com.raghu.comp.Employee;
import com.raghu.comp.Person;
import com.raghu.comp.Student;

public class FactoryPatternProblemTest {

	public static void main(String[] args) {
		// create AadharDetails class obj
		AadharDetails details=new AadharDetails(9999999L, 23, 8186060687L);// dependent class obj
		// super class refernce variable can refer subclass obj
		Person emp=new Employee("Raghu", "HYD", details,"TCS", 65000);
		System.out.println(emp);
		System.out.println("==================");
		AadharDetails details1=new AadharDetails(12345L, 28, 999999999L);// dependent class obj
		Person stud=new Student("Bujji", "Bangalore", details1, "Java", 123);
		System.out.println(stud);
		System.out.println("==================");

	}

}
