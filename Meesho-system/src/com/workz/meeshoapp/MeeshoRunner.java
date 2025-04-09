package com.workz.meeshoapp;


import com.workz.meeshoapp.meesho.Meesho;
import com.workz.meeshoapp.meeshoDto.MeeshoDto;

public class MeeshoRunner {
    public static void main(String[] args) {
        MeeshoDto meeshoDto = new MeeshoDto();
        meeshoDto.setFullName("Vijay Kumar");
        meeshoDto.setMobileNumber("9876543210");
        meeshoDto.setEmail("vijay@meesho.com");
        meeshoDto.setPassword("Vijay@123");
        meeshoDto.setDeliveryAddress("Hyderabad, India");

        Meesho meeshoApp = new Meesho();
        meeshoApp.userRegistered(meeshoDto);
        meeshoApp.fetchDetails();
    }
}
