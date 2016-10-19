package com.banking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {
	private String firstName;
	private String lastName;
	private List<Account> account;

	// 创建客户
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		account = new ArrayList<>();
	}

	// 返回指定客户账户
	public Account getAccount(int acct_idx) {
		return account.get(acct_idx);
	}

	// 设置客户账户
	public void addAccount(Account account) {
		this.account.add(account);
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
		return account.size();
	}
	public Iterator<Account> getAccounts() {
		return account.iterator();
	}
}
