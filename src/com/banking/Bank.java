package com.banking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {
	private List<Customer> customer;
	private static Bank bank = new Bank();
	
	// ��������ʼ��customer����
	private Bank() {
		customer = new ArrayList<>();
	}

	public static Bank getBank() {
		return bank;
	}
	// ��ӹ˿͵�customer����
	public void addCustomer(String f, String l) {
		customer.add(new Customer(f, l));
	}

	// ����customer����ָ���Ĺ˿Ͷ���
	public Customer getCustomer(int index) {
		return customer.get(index);
	}
	
	public Iterator<Customer> getCustomers() {
		Iterator<Customer> iterator = customer.iterator();
		return iterator;
	}
	
	public int getNumOfCustomers() {
		return customer.size();
	}
}
