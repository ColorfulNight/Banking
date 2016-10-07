package com.banking;

public class Customer {
	private String firstName;
	private String lastName;
	private Account[] account;
	private int NumOfAccounts = 0;

	// 创建客户
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		account = new Account[5];
	}

	// 返回指定客户账户
	public Account getAccount(int acct_idx) {
		return account[acct_idx];
	}

	// 设置客户账户
	public void addAccount(Account account) {
		this.account[NumOfAccounts] = account;
		NumOfAccounts += 1;
	}

	// 返回firstName
	public String getFirstName() {
		return firstName;
	}

	// 返回lastName
	public String getLastName() {
		return lastName;
	}

	// 返回账户个数
	public int getNumOfAccounts() {
		return NumOfAccounts;
	}

}
