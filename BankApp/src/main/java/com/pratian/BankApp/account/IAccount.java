package com.pratian.BankApp.account;

public interface IAccount {
	public void open();
	public void close();
	public String getAccTypes();
	public void deposit(double amount);
	public void withdraw(double amount);
}
