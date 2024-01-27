package com.raghu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghu.beans.Student;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		// Hold the name and location of spring bean cfg file in ApplicationContext
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/raghu/spcfg/applicationContext.xml");
		// get target spring bean class obj 
		Student std=(Student)ctx.getBean("std");
		// invoke the b.method
		std.printStudentDetails();
		

	}

}
