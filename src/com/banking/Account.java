package com.banking;

public class Account {
	private double balance;
	
//	�����˻�
	public Account(double init_balance) {
		super();
		this.balance = init_balance;
	}

//	�������
	public double getBalance() {
		return balance;
	}
	
//	��Ǯ
	public void deposit(double amt) {
		this.balance+=amt;
	}
	
//	ȡǮ
	public void withdraw(double amt) {
		this.balance-=amt;
	}
}
