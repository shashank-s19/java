package com.xworkz.instamart.instamartapp;

import com.xworkz.instamart.instamartdto.InstamartDto;

public class InstamartApp {
    InstamartDto dto;

    public void userRegistered(InstamartDto zeptoDto) {
        boolean isValid = validateUser(zeptoDto);
        boolean isvalid = false;

        if (isValid) {
            isvalid = true;
            dto = zeptoDto;
        } else {
            System.out.println("Registration failed");
        }
    }

    public boolean validateUser(InstamartDto zeptoDto) {
        boolean isvalid = false;
        boolean isFullNameValid = false;
        boolean isMobileNumberValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isShippingAddressValid = false;

        if (zeptoDto.getFullName() != null && !zeptoDto.getFullName().isEmpty())
            isFullNameValid = true;
        else
            System.out.println("Invalid full name. Please try again later.");

        if (zeptoDto.getMobileNumber() != null && !zeptoDto.getMobileNumber().isEmpty())
            isMobileNumberValid = true;
        else
            System.out.println("Invalid mobile number. Please try again later.");

        if (zeptoDto.getEmail() != null && zeptoDto.getEmail().contains("@"))
            isEmailValid = true;
        else
            System.out.println("Invalid email address. Please enter a valid email.");

        if (zeptoDto.getPassword() != null && !zeptoDto.getPassword().isEmpty())
            isPasswordValid = true;
        else
            System.out.println("Invalid password.");

        if (zeptoDto.getShippingAddress() != null && !zeptoDto.getShippingAddress().isEmpty())
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
