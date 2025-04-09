package com.xworkz.westside.westsideapp;

import com.xworkz.westsideapp.westsidedto.ZudioDto;

public class Westside {
    ZudioDto dto;

    public void userRegistered(ZudioDto zudioDto) {
        boolean isValid = validateUser(zudioDto);
        boolean isRegistered = false;

        if (isValid) {
            isRegistered = true;
            dto = zudioDto;
        } else {
            System.out.println("Registration failed");
        }
    }

    public boolean validateUser(ZudioDto zudioDto) {
        boolean isValid = false;
        boolean isFullNameValid = false;
        boolean isMobileNumberValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isShippingAddressValid = false;

        if (zudioDto.getFullName() != null && !zudioDto.getFullName().isEmpty())
            isFullNameValid = true;
        else
            System.out.println("Invalid full name. Please try again later.");

        if (zudioDto.getMobileNumber() != null && !zudioDto.getMobileNumber().isEmpty())
            isMobileNumberValid = true;
        else
            System.out.println("Invalid mobile number. Please try again later.");

        if (zudioDto.getEmail() != null && zudioDto.getEmail().contains("@"))
            isEmailValid = true;
        else
            System.out.println("Invalid email address. Please enter a valid email.");

        if (zudioDto.getPassword() != null && !zudioDto.getPassword().isEmpty())
            isPasswordValid = true;
        else
            System.out.println("Invalid password.");

        if (zudioDto.getShippingAddress() != null && !zudioDto.getShippingAddress().isEmpty())
            isShippingAddressValid = true;
        else
            System.out.println("Invalid shipping address.");

        if (isFullNameValid && isMobileNumberValid && isEmailValid && isPasswordValid && isShippingAddressValid)
            isValid = true;

        return isValid;
    }

    public void fetchDetails() {
        System.out.println("Full name is: " + dto.getFullName());
        System.out.println("User mobile number is: " + dto.getMobileNumber());
        System.out.println("User email is: " + dto.getEmail());
        System.out.println("User shipping address is: " + dto.getShippingAddress());
        System.out.println("User password is: " + dto.getPassword());
    }
}
