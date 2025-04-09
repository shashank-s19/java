package com.xworkz.spotify.spotifyapp;

import com.xworkz.spotify.spotifydto.SpotifyDto;

public class SpotifyApp {
    SpotifyDto dto;

    public void userRegistered(SpotifyDto spotifyDto) {
        boolean isValid = validateUser(spotifyDto);
        boolean isRegistered = false;

        if (isValid) {
            isRegistered = true;
            dto = spotifyDto;
        } else {
            System.out.println("Registration failed");
        }
    }

    public boolean validateUser(SpotifyDto spotifyDto) {
        boolean isValid = false;
        boolean isFullNameValid = false;
        boolean isMobileNumberValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isShippingAddressValid = false;

        if (spotifyDto.getFullName() != null && !spotifyDto.getFullName().isEmpty())
            isFullNameValid = true;
        else
            System.out.println("Invalid full name. Please try again later.");

        if (spotifyDto.getMobileNumber() != null && !spotifyDto.getMobileNumber().isEmpty())
            isMobileNumberValid = true;
        else
            System.out.println("Invalid mobile number. Please try again later.");

        if (spotifyDto.getEmail() != null && spotifyDto.getEmail().contains("@"))
            isEmailValid = true;
        else
            System.out.println("Invalid email address. Please enter a valid email.");

        if (spotifyDto.getPassword() != null && !spotifyDto.getPassword().isEmpty())
            isPasswordValid = true;
        else
            System.out.println("Invalid password.");

        if (spotifyDto.getShippingAddress() != null && !spotifyDto.getShippingAddress().isEmpty())
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
