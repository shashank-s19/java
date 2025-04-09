package com.xworkz.phonepe.phonepeapp;

import com.xworkz.phonepe.phonepedto.PhonePeDto;

public class PhonePeApp {
    PhonePeDto dto;

    public void register(PhonePeDto phonePeDto) {
        boolean isValid = validate(phonePeDto);
        if (isValid) {
            dto = phonePeDto;
        } else {
            System.out.println("Registration failed. Please check your details.");
        }
    }

    public boolean validate(PhonePeDto phonePeDto) {
        boolean isValid = true;

        if (phonePeDto.getFullName() == null || phonePeDto.getFullName().isEmpty()) {
            System.out.println("Invalid full name.");
            isValid = false;
        }

        if (phonePeDto.getEmail() == null || !phonePeDto.getEmail().contains("@")) {
            System.out.println("Invalid email.");
            isValid = false;
        }

        if (phonePeDto.getMobileNumber() == null || phonePeDto.getMobileNumber().length() != 10) {
            System.out.println("Invalid mobile number.");
            isValid = false;
        }

        if (phonePeDto.getUpiId() == null || !phonePeDto.getUpiId().contains("@")) {
            System.out.println("Invalid UPI ID.");
            isValid = false;
        }

        if (phonePeDto.getPassword() == null || phonePeDto.getPassword().length() < 6) {
            System.out.println("Password too short.");
            isValid = false;
        }

        if (phonePeDto.getLinkedBank() == null || phonePeDto.getLinkedBank().isEmpty()) {
            System.out.println("Bank not linked.");
            isValid = false;
        }

        return isValid;
    }

    public void showDetails() {
        if (dto != null) {
            System.out.println("PhonePe Registration Successful!");
            System.out.println("Full Name: " + dto.getFullName());
            System.out.println("Email: " + dto.getEmail());
            System.out.println("Mobile: " + dto.getMobileNumber());
            System.out.println("UPI ID: " + dto.getUpiId());
            System.out.println("Password: " + dto.getPassword());
            System.out.println("Linked Bank: " + dto.getLinkedBank());
        }
    }
}
