package com.pratian.BankApp.account;

import java.util.Date;

import javax.persistence.Entity;
@Entity
public class Current extends Account{

	public Current() {
		super();
	}
	
	public Current(String name, String pin, Date dateOfOpening, double balance, PriviligeType privligeType) {
		super(name, pin, dateOfOpening, balance, privligeType);
	}
	
	
	public void open() {
		// TODO Auto-generated method stub
		this.accNo="CUR"+super.generateAccNumber();
		this.active=true;
		this.dateOfOpening=new Date();
	} 
	
	public String getAccTypes() {
		return "current";
	}
}
