package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/autoconfig.xml");
		
		Customer c = context.getBean("cust",Customer.class);
		
		System.out.println(c);
	}

}
