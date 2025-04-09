package com.xworkz.ola;

import com.xworkz.ola.olaapp.OlaApp;
import com.xworkz.ola.oladto.OlaDto;

public class OlaRunner {

    public static void main(String[] args) {
        OlaDto olaDto = new OlaDto();
        olaDto.setFullName("Shashank");
        olaDto.setMobileNumber("6362410707");
        olaDto.setEmail("shashank@gmail.com");
        olaDto.setPassword("shashank@123");
        olaDto.setPickupLocation("kormangla, Bangalore");

        OlaApp olaApp = new OlaApp();
        olaApp.userRegistered(olaDto);
        olaApp.fetchDetails();
    }}