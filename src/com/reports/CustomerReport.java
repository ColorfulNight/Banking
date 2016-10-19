package com.reports;

import java.util.Iterator;
import com.banking.Account;
import com.banking.Bank;
import com.banking.Customer;
import com.banking.SavingAccount;

public class CustomerReport {

	public void generateReport() {
		Bank bank = Bank.getBank();
		Iterator<Customer> iterator = bank.getCustomers();
		Iterator<Account> accountIterator;
		// Generate a report
		System.out.println("\t\t\tCUSTOMERS REPORT");
		System.out.println("\t\t\t================");

		while (iterator.hasNext()) {
			Customer customer = iterator.next();
			accountIterator = customer.getAccounts();
			System.out.println();
			System.out.println("Customer: " + customer.getLastName() + ", " + customer.getFirstName());

			while (accountIterator.hasNext()) {
				Account account = (Account) accountIterator.next();
				String account_type = "";

				// Determine the account type
				/***
				 * Step 1: Use the instanceof operator to test what type of
				 * account we have and set account_type to an appropriate value,
				 * such as "Savings Account" or "Checking Account".
				 ***/
				if (account instanceof SavingAccount) {
					account_type = "\tSaving Account :";
				} else {
					account_type = "\tChecking Account :";
				}
				// Print the current balance of the account
				/***
				 * Step 2: Print out the type of account and the balance. Feel
				 * free to use the currency_format formatter to generate a
				 * "currency string" for the balance.
				 ***/
				System.out.println(account_type + "current balance is гд" + account.getBalance());
			}
		}

	}

}
