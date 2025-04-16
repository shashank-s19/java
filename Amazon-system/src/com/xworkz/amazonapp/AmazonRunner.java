package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.AmazonAccount;
import com.xworkz.amazonapp.amazonsys.Amazon;

public class AmazonRunner {
    public static void main(String[] args) {
        AmazonAccount account = new AmazonAccount();
        account.setName("Shubha");
        account.setEmail("shubha@gmail.com");
        account.setPassword("shubha@123");
        account.setCity(City.BANGALORE);
        account.setAccountType(AccountType.PRIME);

         Amazon seva = new Amazon();

        if (seva.isRegistered(account)) {
            System.out.println("Amazon account registration successful");
        } else {
            System.out.println("Amazon account registration failed");
        }
    }
}
