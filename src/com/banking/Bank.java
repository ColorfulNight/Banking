package com.banking;

public class Bank {
	private Customer[] customer;
	private int numberOfCustomer = 0;

	// ��������ʼ��customer����
	public Bank() {
		customer = new Customer[5];
	}

	// ��ӹ˿͵�customer����
	public void addCustomer(String f, String l) {
		customer[numberOfCustomer] = new Customer(f, l);
		numberOfCustomer+=1;
	}

	// ����customer�������еĹ˿�����
	public int getNumOfCustomers() {
		return this.numberOfCustomer;
	}

	// ����customer����ָ���Ĺ˿Ͷ���
	public Customer getCustomer(int index) {
		return customer[index];
	}
}
