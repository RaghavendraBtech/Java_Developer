package com.raghu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.raghu.bean.ElectricBill;

@Configuration
@ComponentScan("com.raghu.bean")
public class AnnotationTest {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AnnotationTest.class);
		ElectricBill eb=(ElectricBill)ctx.getBean(ElectricBill.class);
		eb.printBill();
	}

}
