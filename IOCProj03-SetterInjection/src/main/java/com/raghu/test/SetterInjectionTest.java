package com.raghu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghu.beans.Student;

public class SetterInjectionTest {

	public static void main(String[] args) {
		// Hold the name and location of spring bean cfg file in ApplicationContext
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/raghu/spcfg/applicationContext.xml");
		Student std=(Student)ctx.getBean("std");
		// invoke b.method
		std.printStudentDetails();
		

	}

}
