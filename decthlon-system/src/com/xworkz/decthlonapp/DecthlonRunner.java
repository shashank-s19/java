package com.xworkz.decthlonapp;


import com.xworkz.decthlonapp.decthlon.Decthlon;
import com.xworkz.decthlonapp.decthlonDto.DecthlonDto;

public class DecthlonRunner {
    public static void main(String[] args) {
        DecthlonDto decthlonDto = new DecthlonDto();
        decthlonDto.setFullName("Rahul Sharma");
        decthlonDto.setMobileNumber("9123456780");
        decthlonDto.setEmail("rahul@decthlon.com");
        decthlonDto.setPassword("Rahul@123");
        decthlonDto.setDeliveryAddress("Delhi, India");

        Decthlon decthlonApp = new Decthlon();
        decthlonApp.userRegistered(decthlonDto);
        decthlonApp.fetchDetails();
    }
}
