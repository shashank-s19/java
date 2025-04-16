package com.xworkz.instagramapp;

import com.xworkz.instagramapp.Instagram.InstagramAccount;
import com.xworkz.instagramapp.insta.Insta;

public class InstagramRunner {
    public static void main(String[] args) {
        InstagramAccount account = new InstagramAccount();
        account.setDeviceType(DeviceType.Android);
        account.setCountry(Country.India);
        account.setUsername("shubham_mp");
        account.setEmail("shubham@gmail.com");
        account.setPassword("12345");
        account.setConfirmPassword("12345");
        account.setFullName("Shubham M P");
        account.setDob("11/08/2003");
        account.setPhoneNumber("9876543210");
        account.setSecurityQuestion("What is your pet's name?");
        account.setSecurityAnswer("Fluffy");
        account.setCaptcha("X1y2Z3");

        Insta insta = new Insta();
        if (insta.isAccountRegistered(account)) {
            System.out.println("Instagram account registration successful");
        } else {
            System.out.println("Instagram account registration failed");
        }
    }
}
