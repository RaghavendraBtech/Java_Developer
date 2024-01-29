package com.raghu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raghu.beans.Student;
import com.raghu.config.JavaConfig;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(JavaConfig.class);
		Student st=ctx.getBean(Student.class, "std1");
		st.printStdDetails();

	}

}
