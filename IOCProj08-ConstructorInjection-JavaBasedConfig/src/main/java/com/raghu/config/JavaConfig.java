package com.raghu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.raghu.beans.Student;

@Configuration
public class JavaConfig {
	
	@Bean("std1")
	public Student getStudent() {
		Student std=new Student(100,"raghu");
		return std;
	}

}
