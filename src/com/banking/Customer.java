package com.banking;

public class Customer {
	private String firstName;
	private String lastName;
	private Account[] account;
	private int NumOfAccounts = 0;

	// �����ͻ�
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		account = new Account[5];
	}

	// ����ָ���ͻ��˻�
	public Account getAccount(int acct_idx) {
		return account[acct_idx];
	}

	// ���ÿͻ��˻�
	public void addAccount(Account account) {
		this.account[NumOfAccounts] = account;
		NumOfAccounts += 1;
	}

	// ����firstName
	public String getFirstName() {
		return firstName;
	}

	// ����lastName
	public String getLastName() {
		return lastName;
	}

	// �����˻�����
	public int getNumOfAccounts() {
		return NumOfAccounts;
	}

}
