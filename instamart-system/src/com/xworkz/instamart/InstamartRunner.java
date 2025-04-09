package com.xworkz.instamart;

import com.xworkz.instamart.instamartapp.InstamartApp;
import com.xworkz.instamart.instamartdto.InstamartDto;

public class InstamartRunner {
    public static void main(String[] args) {
        InstamartDto zeptoDto = new InstamartDto();
        zeptoDto.setFullName("Shashank B s");
        zeptoDto.setMobileNumber("6362419707");
        zeptoDto.setEmail("shashank@gmail.com");
        zeptoDto.setPassword("shashank@123");
        zeptoDto.setShippingAddress("banglore, India");

        InstamartApp zeptoApp = new InstamartApp();
        zeptoApp.userRegistered(zeptoDto);
        zeptoApp.fetchDetails();
    }
}