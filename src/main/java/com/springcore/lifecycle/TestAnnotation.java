package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TestAnnotation {
	private int age;
	
	public TestAnnotation() {
	}
	
	public void setAge(int age) {
		System.out.println("Setting up age");
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "TestAnnotation [age=" + age + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("start method called....");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("end method called...");
	}
}