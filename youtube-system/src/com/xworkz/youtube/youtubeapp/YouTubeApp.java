package com.xworkz.youtube.youtubeapp;

import com.xworkz.youtube.youtubedto.YouTubeDto;

public class YouTubeApp {
    YouTubeDto dto;

    public void userRegistered(YouTubeDto youTubeDto) {
        boolean isValid = validateUser(youTubeDto);
        boolean isvalid = false;

        if (isValid) {
            isvalid = true;
            dto = youTubeDto;
        } else {
            System.out.println("Registration failed");
        }
    }

    public boolean validateUser(YouTubeDto youTubeDto) {
        boolean isvalid = false;
        boolean isFullNameValid = false;
        boolean isMobileNumberValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isShippingAddressValid = false;

        if (youTubeDto.getFullName() != null && !youTubeDto.getFullName().isEmpty())
            isFullNameValid = true;
        else
            System.out.println("Invalid full name. Please try again later.");

        if (youTubeDto.getMobileNumber() != null && !youTubeDto.getMobileNumber().isEmpty())
            isMobileNumberValid = true;
        else
            System.out.println("Invalid mobile number. Please try again later.");

        if (youTubeDto.getEmail() != null && youTubeDto.getEmail().contains("@"))
            isEmailValid = true;
        else
            System.out.println("Invalid email address. Please enter a valid email.");

        if (youTubeDto.getPassword() != null && !youTubeDto.getPassword().isEmpty())
            isPasswordValid = true;
        else
            System.out.println("Invalid password.");

        if (youTubeDto.getShippingAddress() != null && !youTubeDto.getShippingAddress().isEmpty())
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
