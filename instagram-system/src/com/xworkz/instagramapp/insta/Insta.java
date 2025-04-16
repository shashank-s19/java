package com.xworkz.instagramapp.insta;

import com.xworkz.instagramapp.Instagram.InstagramAccount;

public class Insta {
    public boolean isAccountRegistered(InstagramAccount account) {
        return isAccountValid(account);
    }

    private boolean isAccountValid(InstagramAccount account) {
        boolean isValid = true;

        if (account.getDeviceType() == null) {
            System.out.println("Device Type is missing");
            isValid = false;
        }

        if (account.getCountry() == null) {
            System.out.println("Country is missing");
            isValid = false;
        }

        if (account.getUsername() == null) {
            System.out.println("Username is missing");
            isValid = false;
        }

        if (account.getEmail() == null) {
            System.out.println("Email is missing");
            isValid = false;
        }

        if (account.getPassword() == null || !account.getPassword().equals(account.getConfirmPassword())) {
            System.out.println("Passwords do not match");
            isValid = false;
        }

        if (account.getFullName() == null) {
            System.out.println("Full name is missing");
            isValid = false;
        }

        if (account.getDob() == null) {
            System.out.println("Date of Birth is missing");
            isValid = false;
        }

        if (account.getPhoneNumber() == null) {
            System.out.println("Phone number is missing");
            isValid = false;
        }

        if (account.getSecurityQuestion() == null) {
            System.out.println("Security question is missing");
            isValid = false;
        }

        if (account.getSecurityAnswer() == null) {
            System.out.println("Security answer is missing");
            isValid = false;
        }

        if (account.getCaptcha() == null) {
            System.out.println("Captcha is missing");
            isValid = false;
        }

        return isValid;
    }
}
