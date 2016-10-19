package com.banking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {
	private List<Customer> customer;
	private static Bank bank = new Bank();
	
	// 构造器初始化customer数组
	private Bank() {
		customer = new ArrayList<>();
	}

	public static Bank getBank() {
		return bank;
	}
	// 添加顾客到customer数组
	public void addCustomer(String f, String l) {
		customer.add(new Customer(f, l));
	}

	// 返回customer数组指定的顾客对象
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
