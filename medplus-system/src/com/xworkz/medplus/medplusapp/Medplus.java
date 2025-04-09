package com.xworkz.medplus.medplusapp;

public class Medplus {
    com.xworkz.apollo.apollodto.MedplusDto dto;

    public void registerUser(com.xworkz.apollo.apollodto.MedplusDto apolloDto) {
        boolean isValid = validate(apolloDto);
        if (isValid) {
            dto = apolloDto;
        } else {
            System.out.println(" Registration failed. Please check all fields.");
        }
    }

    public boolean validate(com.xworkz.apollo.apollodto.MedplusDto apolloDto) {
        boolean isValid = true;

        if (apolloDto.getFullName() == null || apolloDto.getFullName().isEmpty()) {
            System.out.println("Full name cannot be empty.");
            isValid = false;
        }

        if (apolloDto.getMobileNumber() == null || apolloDto.getMobileNumber().length() != 10) {
            System.out.println("Invalid mobile number.");
            isValid = false;
        }

        if (apolloDto.getEmail() == null || !apolloDto.getEmail().contains("@")) {
            System.out.println("Invalid email format.");
            isValid = false;
        }

        if (apolloDto.getPassword() == null || apolloDto.getPassword().length() < 6) {
            System.out.println("Password must be at least 6 characters.");
            isValid = false;
        }

        if (apolloDto.getDateOfBirth() == null || apolloDto.getDateOfBirth().isEmpty()) {
            System.out.println("Date of birth cannot be empty.");
            isValid = false;
        }

        if (apolloDto.getHealthInsuranceNumber() == null || apolloDto.getHealthInsuranceNumber().isEmpty()) {
            System.out.println("Health insurance number cannot be empty.");
            isValid = false;
        }

        return isValid;
    }

    public void showDetails() {
        if (dto != null) {
            System.out.println(" Apollo Registration Successful!");
            System.out.println("Full Name: " + dto.getFullName());
            System.out.println("Mobile Number: " + dto.getMobileNumber());
            System.out.println("Email: " + dto.getEmail());
            System.out.println("Password: " + dto.getPassword());
            System.out.println("Date of Birth: " + dto.getDateOfBirth());
            System.out.println("Health Insurance No.: " + dto.getHealthInsuranceNumber());
        }
    }
}
