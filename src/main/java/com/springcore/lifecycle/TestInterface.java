package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TestInterface implements InitializingBean,DisposableBean {
	private int value;
	
	@Override
	public String toString() {
		return "TestInterface [value=" + value + "]";
	}

	public TestInterface(){
	}
	
	public void setValue(int value) {
		System.out.println("Setting up value");
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy()... called");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPopertiesSet()....called");
	}
	
}