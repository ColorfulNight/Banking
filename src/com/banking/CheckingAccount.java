package com.banking;

public class CheckingAccount extends Account {

	SavingAccount protectedBy = null;

	public CheckingAccount(double banlance) {
		super(banlance);
	}

	public CheckingAccount(double balance, SavingAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}

	@Override
	public boolean withdraw(double amt) {
		if (this.balance >= amt) {
			this.balance -= amt;
			return true;
		} else if (protectedBy!=null) {
			if (this.balance+this.protectedBy.getBalance()>amt) {
				this.protectedBy.balance-=amt-this.balance;
				this.balance=0;
				return true;
			} else {
				return false;
			}
		}else {
			return false;
		}
	}
}
