package com.codingdojo.bankaccount;

public class TestBankAccount {

	public static void main(String[] args) {
		
		BankAccount a = new BankAccount(1000.0,2000.0);
		BankAccount b = new BankAccount(4000.0,1000.0);
		
		a.deposit(1000, false);
		b.withdraw(2000, false);
		
		System.out.println(a.getCheckingBalance());
		System.out.println(b.getCheckingBalance());
		
		System.out.println(b.combinedAccounts());
		System.out.println(BankAccount.totalAssets());
		
	}

}
