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
	public void withdraw(double amt) throws OverdraftException {
		if (this.balance>=amt) {
			this.balance-=amt;
		} else {
			throw new OverdraftException("�ʽ���", amt - this.balance);
		}
	}
}
