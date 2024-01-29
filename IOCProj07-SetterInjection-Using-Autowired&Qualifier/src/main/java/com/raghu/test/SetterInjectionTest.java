package com.raghu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghu.beans.EmployeeBean;



public class SetterInjectionTest {

	public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("com/raghu/config/applicationContext.xml");
        EmployeeBean eb=ctx.getBean(EmployeeBean.class, "id1");
        eb.printEmployee();

	}

}
