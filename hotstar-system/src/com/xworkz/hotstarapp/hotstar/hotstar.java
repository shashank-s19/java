package com.xworkz.hotstarapp.hotstar;

import com.xworkz.hotstarapp.hotstardto.HotstarDto;

public class hotstar {
    HotstarDto dto;

    public void userRegistered(HotstarDto netflixDto) {
        boolean isValid = validateUser(netflixDto);
        boolean isvalid = false;

        if (isValid) {
            isvalid = true;
            dto = netflixDto;
        } else {
            System.out.println("Registration failed");
        }
    }

    public boolean validateUser(HotstarDto netflixDto) {
        boolean isvalid = false;
        boolean isFullNameValid = false;
        boolean isMobileNumberValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isShippingAddressValid = false;

        if (netflixDto.getFullName() != null && !netflixDto.getFullName().isEmpty())
            isFullNameValid = true;
        else
            System.out.println("Invalid full name. Please try again later.");

        if (netflixDto.getMobileNumber() != null && !netflixDto.getMobileNumber().isEmpty())
            isMobileNumberValid = true;
        else
            System.out.println("Invalid mobile number. Please try again later.");

        if (netflixDto.getEmail() != null && netflixDto.getEmail().contains("@"))
            isEmailValid = true;
        else
            System.out.println("Invalid email address. Please enter a valid email.");

        if (netflixDto.getPassword() != null && !netflixDto.getPassword().isEmpty())
            isPasswordValid = true;
        else
            System.out.println("Invalid password.");

        if (netflixDto.getShippingAddress() != null && !netflixDto.getShippingAddress().isEmpty())
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
