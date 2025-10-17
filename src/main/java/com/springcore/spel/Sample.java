package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.demo.springcore.Student;

@Component
public class Sample {
	@Value("#{10+20}")
	private int x;
	@Value("#{20+20}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double sqrt;
	
	@Value("#{T(java.lang.Math).PI}")
	private double pi;
	
	@Value("#{ new java.lang.String('Rohit')}")
	private String name;
	
	@Value("#{new com.demo.springcore.Student('Rohit','7121','Anand')}")
	private Student student;
	
	@Override
	public String toString() {
		return "Sample [x=" + x + ", y=" + y + ", sqrt=" + sqrt + ", pi=" + pi + ", name=" + name + ", \nstudent="
				+ student + "]";
	}
	public double getSqrt() {
		return sqrt;
	}
	public void setSqrt(double sqrt) {
		this.sqrt = sqrt;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}