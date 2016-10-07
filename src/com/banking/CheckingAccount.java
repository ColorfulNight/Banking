package com.banking;

public class CheckingAccount extends Account {
	private double overdraftProtection;

	public CheckingAccount(double banlance){
		super(banlance);
	}
	
	public CheckingAccount(double balance, double overdraftProtection) {
		super(balance);
		this.overdraftProtection = overdraftProtection;
	}

	@Override
	public boolean withdraw(double amt) {
		if (this.balance+this.overdraftProtection<amt) {
			return false;
		} else if(this.balance>=amt){
			this.balance-=amt;
			return true;
		}else {
			this.balance=0;
			this.overdraftProtection-=amt-this.balance;
			return true;
		}
	}
}
