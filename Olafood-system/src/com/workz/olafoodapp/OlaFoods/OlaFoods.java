package com.workz.olafoodapp.OlaFoods;

import com.workz.olafoodapp.Olafooddto.OlaFoodsDto;

public class OlaFoods {
    OlaFoodsDto dto;

    public void userRegistered(OlaFoodsDto olaFoodsDto) {
        boolean isValid = validateUser(olaFoodsDto);
        boolean isvalid = false;

        if (isValid) {
            isvalid = true;
            dto = olaFoodsDto;
        } else {
            System.out.println("Registration failed");
        }
    }

    public boolean validateUser(OlaFoodsDto olaFoodsDto) {
        boolean isvalid = false;
        boolean isFullNameValid = false;
        boolean isMobileNumberValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isDeliveryAddressValid = false;

        if (olaFoodsDto.getFullName() != null && !olaFoodsDto.getFullName().isEmpty())
            isFullNameValid = true;
        else
            System.out.println("Invalid full name. Please try again later.");

        if (olaFoodsDto.getMobileNumber() != null && !olaFoodsDto.getMobileNumber().isEmpty())
            isMobileNumberValid = true;
        else
            System.out.println("Invalid mobile number. Please try again later.");

        if (olaFoodsDto.getEmail() != null && olaFoodsDto.getEmail().contains("@"))
            isEmailValid = true;
        else
            System.out.println("Invalid email address. Please enter a valid email.");

        if (olaFoodsDto.getPassword() != null && !olaFoodsDto.getPassword().isEmpty())
            isPasswordValid = true;
        else
            System.out.println("Invalid password.");

        if (olaFoodsDto.getDeliveryAddress() != null && !olaFoodsDto.getDeliveryAddress().isEmpty())
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

