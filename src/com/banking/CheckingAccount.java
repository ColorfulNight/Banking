package com.banking;

public class CheckingAccount extends Account {
	private double overdraftProtection = 0;
	private boolean overProtection;

	public CheckingAccount(double banlance) {
		super(banlance);
	}

	public CheckingAccount(double balance, double overdraftProtection) {
		super(balance);
		this.overdraftProtection = overdraftProtection;
		overProtection = true;
	}

	@Override
	public void withdraw(double amt) throws OverdraftException {
		if (this.balance + this.overdraftProtection < amt) {
			if (overProtection) {
				throw new OverdraftException("Insufficient funds for overdraft protection", amt - balance);
			} else {
				throw new OverdraftException("no overdraft protection", amt - balance);
			}
		} else if (this.balance >= amt) {
			this.balance -= amt;
		} else {
			this.balance = 0;
			this.overdraftProtection -= amt - this.balance;
		}
	}
}
