package com.codingdojo.bankaccount;

public class BankAccount {
	
	private double checkingBalance;
	private double savingsBalance;
	public static int numberOfAccounts;
	public static double assetsUnderManagement;
	
	public BankAccount(double checkBal, double savings) {
		this.checkingBalance = checkBal;
		this.savingsBalance = savings;
		numberOfAccounts++;
		assetsUnderManagement += (checkBal + savings);
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	public void deposit(double amount, boolean savings) {
		if(savings == true) {
			this.savingsBalance += amount;
			assetsUnderManagement += amount;
		}else {
			this.checkingBalance += amount;
			assetsUnderManagement += amount;
		}
	}
	
	public void withdraw(double amount, boolean savings) {
		if(savings == true) {
			if(amount < this.savingsBalance) {
				this.savingsBalance -= amount;
				assetsUnderManagement -= amount;
			} else {
				System.out.println("Insufficient Funds");
			}
			
		}else {
			if(amount < this.checkingBalance) {
				this.checkingBalance -= amount;
				assetsUnderManagement -= amount;
			}else {
				System.out.println("Insufficient Funds");
			}
		}
	}
	
	public double combinedAccounts() {
		return this.checkingBalance + this.savingsBalance;
	}
	
	public static double totalAssets() {
		return assetsUnderManagement;
	}
	

}
