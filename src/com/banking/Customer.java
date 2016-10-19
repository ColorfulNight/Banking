package com.banking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {
	private String firstName;
	private String lastName;
	private List<Account> account;

	// �����ͻ�
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		account = new ArrayList<>();
	}

	// ����ָ���ͻ��˻�
	public Account getAccount(int acct_idx) {
		return account.get(acct_idx);
	}

	// ���ÿͻ��˻�
	public void addAccount(Account account) {
		this.account.add(account);
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
		return account.size();
	}
	public Iterator<Account> getAccounts() {
		return account.iterator();
	}
}
