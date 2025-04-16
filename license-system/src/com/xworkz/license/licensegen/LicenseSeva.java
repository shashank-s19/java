package com.xworkz.license.licensegen;

import com.xworkz.license.license.DrivingLicense;

public class LicenseSeva {
    public boolean isRegistered(DrivingLicense license) {
        return isValid(license);
    }

    private boolean isValid(DrivingLicense license) {
        boolean valid = true;

        if (license.getRtoLocation() == null) {
            System.out.println("RTO location is missing");
            valid = false;
        }

        if (license.getCity() == null) {
            System.out.println("City is missing");
            valid = false;
        }

        if (license.getApplicantName() == null) {
            System.out.println("Applicant name is missing");
            valid = false;
        }

        if (license.getDob() == null) {
            System.out.println("DOB is missing");
            valid = false;
        }

        if (license.getEmail() == null) {
            System.out.println("Email is missing");
            valid = false;
        }

        if (license.getMobileNumber() == null) {
            System.out.println("Mobile number is missing");
            valid = false;
        }

        if (license.getUserId() == null) {
            System.out.println("User ID is missing");
            valid = false;
        }

        if (license.getPassword() == null || license.getConfirmPassword() == null || !license.getPassword().equals(license.getConfirmPassword())) {
            System.out.println("Passwords are invalid or do not match");
            valid = false;
        }

        if (license.getIdProof() == null) {
            System.out.println("ID Proof is missing");
            valid = false;
        }

        if (license.getCaptcha() == null) {
            System.out.println("Captcha is missing");
            valid = false;
        }

        return valid;
    }
}

