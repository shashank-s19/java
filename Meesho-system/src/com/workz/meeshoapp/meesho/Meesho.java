package com.workz.meeshoapp.meesho;


import com.workz.meeshoapp.meeshoDto.MeeshoDto;

public class Meesho {
    MeeshoDto dto;

    public void userRegistered(MeeshoDto meeshoDto) {
        boolean isValid = validateUser(meeshoDto);
        boolean isvalid = false;

        if (isValid) {
            isvalid = true;
            dto = meeshoDto;
        } else {
            System.out.println("Registration failed");
        }
    }

    public boolean validateUser(MeeshoDto meeshoDto) {
        boolean isvalid = false;
        boolean isFullNameValid = false;
        boolean isMobileNumberValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isDeliveryAddressValid = false;

        if (meeshoDto.getFullName() != null && !meeshoDto.getFullName().isEmpty())
            isFullNameValid = true;
        else
            System.out.println("Invalid full name. Please try again later.");

        if (meeshoDto.getMobileNumber() != null && !meeshoDto.getMobileNumber().isEmpty())
            isMobileNumberValid = true;
        else
            System.out.println("Invalid mobile number. Please try again later.");

        if (meeshoDto.getEmail() != null && meeshoDto.getEmail().contains("@"))
            isEmailValid = true;
        else
            System.out.println("Invalid email address. Please enter a valid email.");

        if (meeshoDto.getPassword() != null && !meeshoDto.getPassword().isEmpty())
            isPasswordValid = true;
        else
            System.out.println("Invalid password.");

        if (meeshoDto.getDeliveryAddress() != null && !meeshoDto.getDeliveryAddress().isEmpty())
            isDeliveryAddressValid = true;
        else
            System.out.println("Invalid delivery address.");

        if (isFullNameValid && isMobileNumberValid && isEmailValid && isPasswordValid && isDeliveryAddressValid)
            isvalid = true;

        return isvalid;
    }

    public void fetchDetails() {
        System.out.println("Full name is: " + dto.getFullName());
        System.out.println("User mobile number is: " + dto.getMobileNumber());
        System.out.println("User email is: " + dto.getEmail());
        System.out.println("User delivery address is: " + dto.getDeliveryAddress());
        System.out.println("User password is: " + dto.getPassword());
    }
}
