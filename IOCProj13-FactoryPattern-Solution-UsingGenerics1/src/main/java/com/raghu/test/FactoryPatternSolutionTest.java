package com.raghu.test;

import com.raghu.comp.Customer;
import com.raghu.comp.Employee;
import com.raghu.comp.Person;
import com.raghu.comp.Student;
import com.raghu.factory.PersonFactory;

public class FactoryPatternSolutionTest {

	public static void main(String[] args)  {
		try {
	//use factory to create employee class obj
		Employee emp=PersonFactory.getPerson(Employee.class);
		System.out.println(emp);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		try {
			System.out.println("-------------------------------------");
			Student stud=PersonFactory.getPerson(Student.class);
			System.out.println(stud);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println("-------------------------------------------");
			Customer cust=PersonFactory.getPerson(Customer.class);
			System.out.println(cust);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
