package com.xworkz.hotstarapp;

import com.xworkz.hotstarapp.hotstar.hotstar;
import com.xworkz.hotstarapp.hotstardto.HotstarDto;

public class HotstarRunner {

    public static void main(String[] args) {
        HotstarDto netflixDto = new HotstarDto();
        netflixDto.setFullName("Shashank");
        netflixDto.setMobileNumber("6362419707");
        netflixDto.setEmail("shashank@gmail.com");
        netflixDto.setPassword("shashank@2025");
        netflixDto.setShippingAddress("Banglore, India");

        hotstar netflixApp = new hotstar();
        netflixApp.userRegistered(netflixDto);
        netflixApp.fetchDetails();
    }
}