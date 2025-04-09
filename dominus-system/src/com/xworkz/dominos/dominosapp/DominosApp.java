package com.xworkz.dominos.dominosapp;

import com.xworkz.dominos.dominosdto.DominosDto;

public class DominosApp {
    DominosDto dto;

    public void userRegistered(DominosDto dominosDto) {
        boolean isValid = validateUser(dominosDto);
        boolean isRegistered = false;

        if (isValid) {
            isRegistered = true;
            dto = dominosDto;
        } else {
            System.out.println("Registration failed");
        }
    }

    public boolean validateUser(DominosDto dominosDto) {
        boolean isValid = false;
        boolean isFullNameValid = false;
        boolean isMobileNumberValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isDeliveryAddressValid = false;

        if (dominosDto.getFullName() != null && !dominosDto.getFullName().isEmpty())
            isFullNameValid = true;
        else
            System.out.println("Invalid full name. Please try again later.");

        if (dominosDto.getMobileNumber() != null && !dominosDto.getMobileNumber().isEmpty())
            isMobileNumberValid = true;
        else
            System.out.println("Invalid mobile number. Please try again later.");

        if (dominosDto.getEmail() != null && dominosDto.getEmail().contains("@"))
            isEmailValid = true;
        else
            System.out.println("Invalid email address. Please enter a valid email.");

        if (dominosDto.getPassword() != null && !dominosDto.getPassword().isEmpty())
            isPasswordValid = true;
        else
            System.out.println("Invalid password.");

        if (dominosDto.getDeliveryAddress() != null && !dominosDto.getDeliveryAddress().isEmpty())
            isDeliveryAddressValid = true;
        else
            System.out.println("Invalid delivery address.");

        if (isFullNameValid && isMobileNumberValid && isEmailValid && isPasswordValid && isDeliveryAddressValid)
            isValid = true;

        return isValid;
    }

    public void fetchDetails() {
        System.out.println("Full name is: " + dto.getFullName());
        System.out.println("User mobile number is: " + dto.getMobileNumber());
        System.out.println("User email is: " + dto.getEmail());
        System.out.println("User delivery address is: " + dto.getDeliveryAddress());
        System.out.println("User password is: " + dto.getPassword());
    }
}


