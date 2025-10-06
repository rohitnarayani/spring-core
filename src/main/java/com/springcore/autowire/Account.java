package com.springcore.autowire;

public class Account {
	String ano;
	double balance;
	@Override
	public String toString() {
		return "Account [ano=" + ano + ", balance=" + balance + "]";
	}
	public Account(String ano, double balance) {
		super();
		this.ano = ano;
		this.balance = balance;
	}
	public String getAno() {
		return ano;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}