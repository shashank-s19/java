package com.xworkz.westsideapp;

import com.xworkz.westside.westsideapp.Westside;
import com.xworkz.westsideapp.westsidedto.ZudioDto;

public class WestsideRunner {

    public static void main(String[] args) {
        ZudioDto zudioDto = new ZudioDto();
        zudioDto.setFullName("Shashank");
        zudioDto.setMobileNumber("6362419707");
        zudioDto.setEmail("shashank@gmail.com");
        zudioDto.setPassword("shashankS@123");
        zudioDto.setShippingAddress("kormangla, Bangalore");

        Westside zudioApp = new Westside();
        zudioApp.userRegistered(zudioDto);
        zudioApp.fetchDetails();
    }
}