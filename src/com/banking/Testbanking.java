package com.banking;

public class Testbanking {

	public static void main(String[] args) {
		Customer customer;
	    Account  account;

	    // Create an account that can has a 500.00 balance.
	    System.out.println("Creating the customer Jane Smith.");
	    customer=new Customer("Jane", "Smith");
	    System.out.println("Creating her account with a 500.00 balance.");
	    account=new Account(500.00);
	    customer.setAccount(account);
	    System.out.println("Withdraw 150.00");
		account.withdraw(150.00);
	    System.out.println("Deposit 22.50");
	  	account.deposit(22.50);
	    System.out.println("Withdraw 47.62");
	   	account.withdraw(47.62);
	    // Print out the final account balance
	    System.out.println("Customer [" + customer.getLastName()
			       + ", " + customer.getFirstName()
			       + "] has a balance of " + account.getBalance());
	}

}
