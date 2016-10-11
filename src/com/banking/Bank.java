package com.banking;

public class Bank {
	private Customer[] customer;
	private int numberOfCustomer = 0;
	private static Bank bank = new Bank();
	
	// 构造器初始化customer数组
	private Bank() {
		customer = new Customer[5];
	}

	public static Bank getBank() {
		return bank;
	}
	// 添加顾客到customer数组
	public void addCustomer(String f, String l) {
		customer[numberOfCustomer] = new Customer(f, l);
		numberOfCustomer+=1;
	}

	// 返回customer数组已有的顾客数量
	public int getNumOfCustomers() {
		return this.numberOfCustomer;
	}

	// 返回customer数组指定的顾客对象
	public Customer getCustomer(int index) {
		return customer[index];
	}
}
