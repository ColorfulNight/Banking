package com.banking;

public class Customer {
	private String firstName;
	private String lastName;
	private Account account;
	
//	创建客户
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
//	返回客户账户
	public Account getAccount() {
		return account;
	}

//	设置客户账户
	public void setAccount(Account account) {
		this.account = account;
	}

//	返回firstName
	public String getFirstName() {
		return firstName;
	}

//	返回lastName
	public String getLastName() {
		return lastName;
	}
	
	
}
