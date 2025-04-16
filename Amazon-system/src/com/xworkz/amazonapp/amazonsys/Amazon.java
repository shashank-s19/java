package com.xworkz.amazonapp.amazonsys;

import com.xworkz.amazonapp.amazon.AmazonAccount;

public class Amazon {
    public boolean isRegistered(AmazonAccount account) {
        return isValid(account);
    }

    private boolean isValid(AmazonAccount account) {
        boolean isValid = true;

        if (account.getName() == null) {
            System.out.println("Name is missing");
            isValid = false;
        }
        if (account.getEmail() == null) {
            System.out.println("Email is missing");
            isValid = false;
        }
        if (account.getPassword() == null) {
            System.out.println("Password is missing");
            isValid = false;
        }
        if (account.getCity() == null) {
            System.out.println("City is missing");
            isValid = false;
        }
        if (account.getAccountType() == null) {
            System.out.println("Account type is missing");
            isValid = false;
        }

        return isValid;
    }
}

