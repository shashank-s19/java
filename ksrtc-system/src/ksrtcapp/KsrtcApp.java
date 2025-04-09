package com.xworkz.bmtc.bmtcapp;

public class KsrtcApp {
    
    com.xworkz.bmtc.bmtcdto.KsrtcDto dto;

    public void registerUser(com.xworkz.bmtc.bmtcdto.KsrtcDto bmtcDto) {
        boolean isValid = validate(bmtcDto);
        if (isValid) {
            dto = bmtcDto;
        } else {
            System.out.println("❌ Registration failed. Please correct the details.");
        }
    }

    public boolean validate(com.xworkz.bmtc.bmtcdto.KsrtcDto bmtcDto) {
        boolean isValid = true;

        if (bmtcDto.getFullName() == null || bmtcDto.getFullName().isEmpty()) {
            System.out.println("Invalid full name.");
            isValid = false;
        }

        if (bmtcDto.getMobileNumber() == null || bmtcDto.getMobileNumber().length() != 10) {
            System.out.println("Invalid mobile number.");
            isValid = false;
        }

        if (bmtcDto.getEmail() == null || !bmtcDto.getEmail().contains("@")) {
            System.out.println("Invalid email address.");
            isValid = false;
        }

        if (bmtcDto.getPassword() == null || bmtcDto.getPassword().length() < 6) {
            System.out.println("Password must be at least 6 characters.");
            isValid = false;
        }

        if (bmtcDto.getAadharNumber() == null || bmtcDto.getAadharNumber().length() != 12) {
            System.out.println("Invalid Aadhar number.");
            isValid = false;
        }

        return isValid;
    }

    public void showDetails() {
        if (dto != null) {
            System.out.println(" Tummoc Registration Successful!");
            System.out.println("Name: " + dto.getFullName());
            System.out.println("Mobile: " + dto.getMobileNumber());
            System.out.println("Email: " + dto.getEmail());
            System.out.println("Password: " + dto.getPassword());
            System.out.println("Aadhar: " + dto.getAadharNumber());
        }
    }
}
