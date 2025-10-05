package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		
		Customer c1 = (Customer) context.getBean("cust1");
//		System.out.println(c1);
		
		System.out.println(c1.getName());
		System.out.println(c1.getPhno());
		System.out.println(c1.getAddresses());
		System.out.println(c1.getAccounts());
		System.out.println(c1.getProps());
	}

}
