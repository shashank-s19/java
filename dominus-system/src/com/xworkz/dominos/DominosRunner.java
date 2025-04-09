package com.xworkz.dominos;

import com.xworkz.dominos.dominosapp.DominosApp;
import com.xworkz.dominos.dominosdto.DominosDto;

public class DominosRunner {

    public static void main(String[] args) {
        DominosDto dominosDto = new DominosDto();
        dominosDto.setFullName("lini");
        dominosDto.setMobileNumber("9876543200");
        dominosDto.setEmail("lini@gmail.com");
        dominosDto.setPassword("lini@123");
        dominosDto.setDeliveryAddress("Anna Nagar, Chennai");

        DominosApp dominosApp = new DominosApp();
        dominosApp.userRegistered(dominosDto);
        dominosApp.fetchDetails();
    }
}