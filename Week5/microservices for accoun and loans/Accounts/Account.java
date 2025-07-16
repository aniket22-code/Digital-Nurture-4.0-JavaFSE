package com.cognizant.entity;

public class Account {

	private String type;
	private long number;
	private double balance;

	public Account(String type, long number, double balance) {
		super();
		this.type = type;
		this.number = number;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [type=" + type + ", number=" + number + ", balance=" + balance + "]";
	}

	public String getType() {
		return type;
	}

	public long getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

}
