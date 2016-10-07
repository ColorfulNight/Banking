package com.banking;

public class Customer {
	private String firstName;
	private String lastName;
	private SavingAccount savingAccount = null;
	private CheckingAccount checkingAccount = null;

	// 创建客户
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// 返回指定客户储蓄账户
	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}

	// 返回指定客户储蓄账户
	public SavingAccount getSavingAccount() {
		return savingAccount;
	}

	// 设置客户支票账户
	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}

	// 设置客户储蓄账户
	public void setSavingAccount(SavingAccount savingAccount) {
		this.savingAccount = savingAccount;
	}

	// 返回firstName
	public String getFirstName() {
		return firstName;
	}

	// 返回lastName
	public String getLastName() {
		return lastName;
	}

}
