package com.springcore.autowire;

public class Customer {
	private String cid;
	private String cname;
	private Account acc;
	
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	public String getCid() {
		return cid;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public Customer(Account acc) {
		super();
		this.acc = acc;
		System.out.println("Inside constructor acc");
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", acc=" + acc + "]";
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
}