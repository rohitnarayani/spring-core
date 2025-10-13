package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		
		Student student1 = context.getBean("obj",Student.class);
		Student student2 = context.getBean("obj",Student.class);
		
//		System.out.println(student);
//		System.out.println(student.getFriends());
//		System.out.println(student.getFriends().getClass().getName());
		
		Sample sample1 = context.getBean("s1",Sample.class);
		Sample sample2 = context.getBean("s1",Sample.class);
		
		System.out.println(sample1.hashCode());
		
		System.out.println("__________________________________________________________________");
		
		System.out.println(sample2.hashCode());
		
		System.out.println("__________________________________________________________________");
		
		System.out.println(student1.hashCode());
		
		System.out.println("__________________________________________________________________");
		
		System.out.println(student2.hashCode());
	}

}
