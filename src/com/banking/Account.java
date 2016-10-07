package com.banking;

public class Account {
	protected double balance;
	
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
	public boolean deposit(double amt) {
		this.balance+=amt;
		return true;
	}
	
//	ȡǮ
	public boolean withdraw(double amt) {
		if (this.balance>=amt) {
			this.balance-=amt;
			return true;
		} else {
			return false;
		}
	}
}
