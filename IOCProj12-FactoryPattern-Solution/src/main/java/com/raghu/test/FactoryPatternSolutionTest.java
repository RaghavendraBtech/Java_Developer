package com.raghu.test;

import com.raghu.comp.Person;
import com.raghu.factory.PersonFactory;

public class FactoryPatternSolutionTest {

	public static void main(String[] args) {
	//use factory to create employee class obj
		Person emp=PersonFactory.getPerson("emp");
		System.out.println(emp);
		System.out.println("---------------------------");
		Person stud=PersonFactory.getPerson("stud");
		System.out.println(stud);
		System.out.println("----------------------------");
		Person cust=PersonFactory.getPerson("cust");
		System.out.println(cust);
	}

}
