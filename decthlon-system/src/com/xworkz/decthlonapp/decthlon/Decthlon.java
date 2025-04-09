package com.xworkz.decthlonapp.decthlon;


import com.xworkz.decthlonapp.decthlonDto.DecthlonDto;

public class Decthlon {
    DecthlonDto dto;

    public void userRegistered(DecthlonDto decthlonDto) {
        boolean isValid = validateUser(decthlonDto);
        boolean isvalid = false;

        if (isValid) {
            isvalid = true;
            dto = decthlonDto;
        } else {
            System.out.println("Registration failed");
        }
    }

    public boolean validateUser(DecthlonDto decthlonDto) {
        boolean isvalid = false;
        boolean isFullNameValid = false;
        boolean isMobileNumberValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isDeliveryAddressValid = false;

        if (decthlonDto.getFullName() != null && !decthlonDto.getFullName().isEmpty())
            isFullNameValid = true;
        else
            System.out.println("Invalid full name. Please try again later.");

        if (decthlonDto.getMobileNumber() != null && !decthlonDto.getMobileNumber().isEmpty())
            isMobileNumberValid = true;
        else
            System.out.println("Invalid mobile number. Please try again later.");

        if (decthlonDto.getEmail() != null && decthlonDto.getEmail().contains("@"))
            isEmailValid = true;
        else
            System.out.println("Invalid email address. Please enter a valid email.");

        if (decthlonDto.getPassword() != null && !decthlonDto.getPassword().isEmpty())
            isPasswordValid = true;
        else
            System.out.println("Invalid password.");

        if (decthlonDto.getDeliveryAddress() != null && !decthlonDto.getDeliveryAddress().isEmpty())
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
