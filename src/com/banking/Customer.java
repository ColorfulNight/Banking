package com.banking;

public class Customer {
	private String firstName;
	private String lastName;
	private Account account;
	
//	�����ͻ�
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
//	���ؿͻ��˻�
	public Account getAccount() {
		return account;
	}

//	���ÿͻ��˻�
	public void setAccount(Account account) {
		this.account = account;
	}

//	����firstName
	public String getFirstName() {
		return firstName;
	}

//	����lastName
	public String getLastName() {
		return lastName;
	}
	
	
}
