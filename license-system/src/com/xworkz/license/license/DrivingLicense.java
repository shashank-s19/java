package com.xworkz.license.license;

import com.xworkz.license.City;
import com.xworkz.license.RtoLocation;

public class DrivingLicense {
    private RtoLocation rtoLocation;
    private City city;
    private String applicantName;
    private String dob;
    private String email;
    private String mobileNumber;
    private String userId;
    private String password;
    private String confirmPassword;
    private String idProof;
    private String captcha;


    public void setRtoLocation(RtoLocation rtoLocation) {
        this.rtoLocation = rtoLocation;
    }

    public RtoLocation getRtoLocation() {
        return rtoLocation;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setIdProof(String idProof) {
        this.idProof = idProof;
    }

    public String getIdProof() {
        return idProof;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getCaptcha() {
        return captcha;
    }
}
