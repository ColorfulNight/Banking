package com.banking;

public class Customer {
	private String firstName;
	private String lastName;
	private SavingAccount savingAccount = null;
	private CheckingAccount checkingAccount = null;

	// �����ͻ�
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// ����ָ���ͻ������˻�
	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}

	// ����ָ���ͻ������˻�
	public SavingAccount getSavingAccount() {
		return savingAccount;
	}

	// ���ÿͻ�֧Ʊ�˻�
	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}

	// ���ÿͻ������˻�
	public void setSavingAccount(SavingAccount savingAccount) {
		this.savingAccount = savingAccount;
	}

	// ����firstName
	public String getFirstName() {
		return firstName;
	}

	// ����lastName
	public String getLastName() {
		return lastName;
	}

}
