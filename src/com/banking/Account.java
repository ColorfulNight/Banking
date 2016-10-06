package com.banking;

public class Account {
	private double balance;
	
//	创建账户
	public Account(double init_balance) {
		super();
		this.balance = init_balance;
	}

//	返回余额
	public double getBalance() {
		return balance;
	}
	
//	存钱
	public void deposit(double amt) {
		this.balance+=amt;
	}
	
//	取钱
	public void withdraw(double amt) {
		this.balance-=amt;
	}
}
