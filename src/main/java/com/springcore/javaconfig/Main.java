package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		// If we use @Bean annotation than we have to keep the name of the method that returns the object of that particular class
		//or if you want a different name then you can specify in @Bean annotation with  array of name
		
		Student student = context.getBean("student",Student.class);
		student.getMessage();
	}

}
