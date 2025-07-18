package com.cognizant.entity;

public class Loans {
	private String number;
	private String type;
	private double loan;
	private int emi;
	private int tenure;

	public Loans(String number, String type, double loan, int emi, int tenure) {

		this.number = number;
		this.type = type;
		this.loan = loan;
		this.emi = emi;
		this.tenure = tenure;
	}

	public String getNumber() {
		return number;
	}

	public String getType() {
		return type;
	}

	public double getLoan() {
		return loan;
	}

	public int getEmi() {
		return emi;
	}

	public int getTenure() {
		return tenure;
	}

	@Override
	public String toString() {
		return "Loans [number=" + number + ", type=" + type + ", loan=" + loan + ", emi=" + emi + ", tenure=" + tenure
				+ "]";
	}

}
