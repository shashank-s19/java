package com.xworkz.customerapp.Customer;

import com.xworkz.customerapp.BankAccount.BankAccount;

public class Customer {

        public int customerId;
        public String customerName;
        public BankAccount[] bankAccounts;

        public void showCustomerDetails() {
            System.out.println("Customer ID: " + customerId);
            System.out.println("Customer Name: " + customerName);
            System.out.println("Bank Accounts: ");
            for (BankAccount bankAccount : bankAccounts) {
                bankAccount.showBankAccountDetails();
            }
        }
    }

