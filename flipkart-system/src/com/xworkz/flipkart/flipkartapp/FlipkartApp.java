package com.xworkz.flipkart.flipkartapp;

import com.xworkz.flipkart.flipkartdto.FlipkartDto;

public class FlipkartApp {
    FlipkartDto dto;

    public void userRegistered(FlipkartDto flipkartDto) {
        boolean isValid = validateUser(flipkartDto);
        boolean isvalid = false;

        if (isValid) {
            isvalid = true;
            dto = flipkartDto;
        } else {
            System.out.println("Registration failed");
        }
    }

    public boolean validateUser(FlipkartDto flipkartDto) {
        boolean isvalid = false;
        boolean isFullNameValid = false;
        boolean isMobileNumberValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isShippingAddressValid = false;

        if (flipkartDto.getFullName() != null && !flipkartDto.getFullName().isEmpty())
            isFullNameValid = true;
        else
            System.out.println("Invalid full name. Please try again later.");

        if (flipkartDto.getMobileNumber() != null && !flipkartDto.getMobileNumber().isEmpty())
            isMobileNumberValid = true;
        else
            System.out.println("Invalid mobile number. Please try again later.");

        if (flipkartDto.getEmail() != null && flipkartDto.getEmail().contains("@"))
            isEmailValid = true;
        else
            System.out.println("Invalid email address. Please enter a valid email.");

        if (flipkartDto.getPassword() != null && !flipkartDto.getPassword().isEmpty())
            isPasswordValid = true;
        else
            System.out.println("Invalid password.");

        if (flipkartDto.getShippingAddress() != null && !flipkartDto.getShippingAddress().isEmpty())
            isShippingAddressValid = true;
        else
            System.out.println("Invalid shipping address.");

        if (isFullNameValid && isMobileNumberValid && isEmailValid && isPasswordValid && isShippingAddressValid)
            isvalid = true;

        return isvalid;
    }

    public void fetchDetails() {
        System.out.println("Full name is: " + dto.getFullName());
        System.out.println("User mobile number is: " + dto.getMobileNumber());
        System.out.println("User email is: " + dto.getEmail());
        System.out.println("User shipping address is: " + dto.getShippingAddress());
        System.out.println("User password is: " + dto.getPassword());
    }
}
