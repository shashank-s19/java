package com.xworkz.rapido.rapidoapp;

import com.xworkz.rapido.rapidodto.RapidoDto;

public class RapidoApp {
    RapidoDto dto;

    public void userRegistered(RapidoDto rapidoDto) {
        boolean isValid = validateUser(rapidoDto);
        boolean isRegistered = false;

        if (isValid) {
            isRegistered = true;
            dto = rapidoDto;
        } else {
            System.out.println("Registration failed");
        }
    }

    public boolean validateUser(RapidoDto rapidoDto) {
        boolean isValid = false;
        boolean isFullNameValid = false;
        boolean isMobileNumberValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isPickupLocationValid = false;

        if (rapidoDto.getFullName() != null && !rapidoDto.getFullName().isEmpty())
            isFullNameValid = true;
        else
            System.out.println("Invalid full name. Please try again later.");

        if (rapidoDto.getMobileNumber() != null && !rapidoDto.getMobileNumber().isEmpty())
            isMobileNumberValid = true;
        else
            System.out.println("Invalid mobile number. Please try again later.");

        if (rapidoDto.getEmail() != null && rapidoDto.getEmail().contains("@"))
            isEmailValid = true;
        else
            System.out.println("Invalid email address. Please enter a valid email.");

        if (rapidoDto.getPassword() != null && !rapidoDto.getPassword().isEmpty())
            isPasswordValid = true;
        else
            System.out.println("Invalid password.");

        if (rapidoDto.getPickupLocation() != null && !rapidoDto.getPickupLocation().isEmpty())
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
