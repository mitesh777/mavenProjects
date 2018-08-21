package com.pratian.BankApp.account;

import java.util.Date;

import javax.persistence.Entity;
@Entity
public class Savings extends Account {

	public Savings() {
		super();
		// TODO Auto-generated constructor stub

	}

	public Savings(String name, String pin, Date dateOfOpening, double balance, PriviligeType privligeType) {
		super(name, pin, dateOfOpening, balance, privligeType);
	}

	public void open() {
		// TODO Auto-generated method stub
		this.accNo = "SAV" + super.generateAccNumber();
		this.active = true;
		this.dateOfOpening = new Date();
	}

	public String getAccTypes() {
		return "savings";
	}

}
