package com.mitesh.JPADemo.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
@Entity
@Table(name="FullTimeEmployee")
public class FullTimeEmployee extends Employee {
	
	
	private double salary;
	private double bonus;
	public FullTimeEmployee() {
		super();
	}
	public FullTimeEmployee(double salary, double bonus,String name, String location) {
		super( name, location);
		this.salary = salary;
		this.bonus = bonus;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "FullTimeEmployee [salary=" + salary + ", bonus=" + bonus + "] " + super.toString();
	}
	
	
}
