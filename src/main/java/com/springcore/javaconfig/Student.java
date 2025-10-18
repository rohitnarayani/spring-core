package com.springcore.javaconfig;

//configuation using @Bean annotation

//@Component("student")
public class Student {
	Sample sample;
	public Student(Sample sample) {
		super();
		this.sample = sample;
	}
	public void getMessage() {
		sample.getMessage();
		System.out.println("Message from student class");
	}
}