package com.pratian.BankApp.exceptions;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String m) {
		super(m);
	}
}
