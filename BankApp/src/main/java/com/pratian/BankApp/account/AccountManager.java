package com.pratian.BankApp.account;

import java.util.Date;

import com.pratian.BankApp.exceptions.InActiveAccountException;
import com.pratian.BankApp.exceptions.InsufficientBalanceException;
import com.pratian.BankApp.exceptions.InvalidPinException;

public class AccountManager {
	
	
	
	public IAccount createAccount(String name, String pin, Date dateOfOpening,
			double balance, PriviligeType privligeType, AccountType accountType) {
		IAccount account = AccountFactory.create(name, pin, dateOfOpening, balance, privligeType, accountType);
		account.open();
		return account;
	}
	
	public void withdrawFromAccount(IAccount account,String pin,double amount) throws InActiveAccountException,
	InvalidPinException, InsufficientBalanceException {
		Account accountObj = (Account)account;
		if(!accountObj.isActive()) {
			throw new InActiveAccountException("Sorry account is inactive");
		}
		if(!accountObj.getPin().equals(pin)) {
			throw new InvalidPinException("Sorry pin wrong");
		}
		if(accountObj.getBalance()<amount) {
			throw new InsufficientBalanceException("Sorry Insufficient balance");
		}
		accountObj.withdraw(amount);
	}
	
	public void depositToAccount(IAccount account,double amount) throws InActiveAccountException {
		Account accountObj = (Account)account;
		if(!accountObj.isActive()) {
			throw new InActiveAccountException("Sorry account is inactive");
		}
		accountObj.deposit(amount);
		System.out.println("deposited");
	}
	
	public void transfer(IAccount fromAccount, IAccount toAccount,String fromAccountpin,double amount) throws InActiveAccountException,
	InvalidPinException, InsufficientBalanceException{
		Account accountObjFrom = (Account)fromAccount;
		if(!accountObjFrom.isActive()) {
			throw new InActiveAccountException("Sorry account is inactive");
		}
		if(!accountObjFrom.getPin().equals(fromAccountpin)) {
			throw new InvalidPinException("Sorry pin wrong");
		}
		if(accountObjFrom.getBalance()<amount) {
			throw new InsufficientBalanceException("Sorry Insufficient balance");
		}
		Account accountObjTo = (Account)toAccount;
		if(!accountObjTo.isActive()) {
			throw new InActiveAccountException("Sorry account receiver is inactive");
		}
		accountObjFrom.withdraw(amount);
		accountObjTo.deposit(amount);
		
	}
	
}
