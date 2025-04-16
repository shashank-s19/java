package com.xworkz.license;

import com.xworkz.license.license.DrivingLicense;
import com.xworkz.license.licensegen.LicenseSeva;

public class LicenseRunner {
    public static void main(String[] args) {
        DrivingLicense license = new DrivingLicense();
        license.setRtoLocation(RtoLocation.ElectronicCity);
        license.setCity(City.Bengaluru);
        license.setApplicantName("Shubha M P");
        license.setDob("11/08/2003");
        license.setEmail("shubha@example.com");
        license.setMobileNumber("9876543210");
        license.setUserId("user01");
        license.setPassword("pass123");
        license.setConfirmPassword("pass123");
        license.setIdProof("AadharCard123");
        license.setCaptcha("DL2024");

        LicenseSeva seva = new LicenseSeva();
        if (seva.isRegistered(license)) {
            System.out.println("Driving License registration successful");
        } else {
            System.out.println("Registration failed");
        }
    }
}
