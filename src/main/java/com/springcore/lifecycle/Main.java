package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context  = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		context.registerShutdownHook();
//		Test t = (Test) context.getBean("t1");
//		System.out.println(t);
//		
//		TestInterface ti = (TestInterface) context.getBean("ti");
//		System.out.println(ti);
		
		TestAnnotation ta = (TestAnnotation) context.getBean("ta");
		System.out.println(ta);
	}

}
