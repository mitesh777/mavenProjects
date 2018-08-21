package com.pratian.BankApp.account;

import java.util.Date;

public class AccountFactory {
	public static IAccount create(String name, String pin, Date dateOfOpening,
			double balance, PriviligeType privligeType, AccountType accountType) {
		IAccount account = null;
		switch(accountType) {
			case SAVINGS: account = new Savings(name, pin, dateOfOpening, balance, privligeType);
				break;
			case CURRENT: account = new Current(name, pin, dateOfOpening, balance, privligeType);
				break;
		}
		
		return account;
	}
}
