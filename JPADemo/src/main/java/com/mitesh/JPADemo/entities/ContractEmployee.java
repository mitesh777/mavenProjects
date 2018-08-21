package com.mitesh.JPADemo.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Contract_Employee")
public class ContractEmployee extends Employee {

	private double ratePerHour;
	private double ratePerDiem;
	public ContractEmployee(double ratePerHour, double ratePerDiem, String name, String location) {
		super(name,location);
		this.ratePerHour = ratePerHour;
		this.ratePerDiem = ratePerDiem;
	}
	public ContractEmployee() {
		super();
	}
	public double getRatePerHour() {
		return ratePerHour;
	}
	public void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}
	public double getRatePerDiem() {
		return ratePerDiem;
	}
	public void setRatePerDiem(double ratePerDiem) {
		this.ratePerDiem = ratePerDiem;
	}
	@Override
	public String toString() {
		return "ContractEmployee [ratePerHour=" + ratePerHour + ", ratePerDiem=" + ratePerDiem + "]"+ super.toString();
	}
	
	 
}
