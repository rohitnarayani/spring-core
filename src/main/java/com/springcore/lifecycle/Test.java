package com.springcore.lifecycle;

public class Test {
	private double price;
	
	Test(){
	}
	
	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Test [price=" + price + "]";
	}
	
	
	public void init() {
		System.out.println("Inside init method...");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method...");
	}
}