package com.xworkz.ola.olaapp;

import com.xworkz.ola.oladto.OlaDto;

public class OlaApp {
    OlaDto dto;

    public void userRegistered(OlaDto olaDto) {
        boolean isValid = validateUser(olaDto);
        boolean isRegistered = false;

        if (isValid) {
            isRegistered = true;
            dto = olaDto;
        } else {
            System.out.println("Registration failed");
        }
    }

    public boolean validateUser(OlaDto olaDto) {
        boolean isValid = false;
        boolean isFullNameValid = false;
        boolean isMobileNumberValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isPickupLocationValid = false;

        if (olaDto.getFullName() != null && !olaDto.getFullName().isEmpty())
            isFullNameValid = true;
        else
            System.out.println("Invalid full name. Please try again later.");

        if (olaDto.getMobileNumber() != null && !olaDto.getMobileNumber().isEmpty())
            isMobileNumberValid = true;
        else
            System.out.println("Invalid mobile number. Please try again later.");

        if (olaDto.getEmail() != null && olaDto.getEmail().contains("@"))
            isEmailValid = true;
        else
            System.out.println("Invalid email address. Please enter a valid email.");

        if (olaDto.getPassword() != null && !olaDto.getPassword().isEmpty())
            isPasswordValid = true;
        else
            System.out.println("Invalid password.");

        if (olaDto.getPickupLocation() != null && !olaDto.getPickupLocation().isEmpty())
            isPickupLocationValid = true;
        else
            System.out.println("Invalid pickup location.");

        if (isFullNameValid && isMobileNumberValid && isEmailValid && isPasswordValid && isPickupLocationValid)
            isValid = true;

        return isValid;
    }

    public void fetchDetails() {
        System.out.println("Full name is: " + dto.getFullName());
        System.out.println("User mobile number is: " + dto.getMobileNumber());
        System.out.println("User email is: " + dto.getEmail());
        System.out.println("User pickup location is: " + dto.getPickupLocation());
        System.out.println("User password is: " + dto.getPassword());
    }
}
