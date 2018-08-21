package com.mitesh.JPADemo.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Address implements Serializable{
	private String street1;
	private String street2;
	private String city;
	private String pin;
	public Address() {
		super();
	}
	public Address(String street1, String street2, String city, String pin) {
		super();
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.pin = pin;
	}
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [street1=" + street1 + ", street2=" + street2 + ", city=" + city + ", pin=" + pin + "]";
	}
	
	
}
