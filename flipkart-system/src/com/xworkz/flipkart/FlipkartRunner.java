
package com.xworkz.flipkart;

import com.xworkz.flipkart.flipkartapp.FlipkartApp;
import com.xworkz.flipkart.flipkartdto.FlipkartDto;

public class FlipkartRunner {

    public static void main(String[] args) {
        FlipkartDto flipkartDto = new FlipkartDto();
        flipkartDto.setFullName("shashank");
        flipkartDto.setMobileNumber("96392285282");
        flipkartDto.setEmail("shashank@gmil.com");
        flipkartDto.setPassword("shashank@2025");
        flipkartDto.setShippingAddress("Bangalore, India");

        FlipkartApp flipkartApp = new FlipkartApp();
        flipkartApp.userRegistered(flipkartDto);
        flipkartApp.fetchDetails();
    }
}
