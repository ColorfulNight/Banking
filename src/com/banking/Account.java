package com.banking;

public class Account {
	protected double balance;
	
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
	public boolean deposit(double amt) {
		this.balance+=amt;
		return true;
	}
	
//	取钱
	public void withdraw(double amt) throws OverdraftException {
		if (this.balance>=amt) {
			this.balance-=amt;
		} else {
			throw new OverdraftException("资金不足", amt - this.balance);
		}
	}
}
