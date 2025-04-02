package com.xworkz.customerapp.BankAccount;

    public class BankAccount {
        public int accountId;
        public double balance;
        public String[] branches;

        public void showBankAccountDetails() {
            System.out.println("Account ID: " + accountId);
            System.out.println("Balance: " + balance);
            System.out.println("Branches: ");
            for (String branch : branches) {
                System.out.println(branch);
            }
        }
    }

