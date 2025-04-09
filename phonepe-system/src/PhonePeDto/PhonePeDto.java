package com.xworkz.phonepe.phonepedto;

public class PhonePeDto {
    private String fullName;
    private String email;
    private String mobileNumber;
    private String upiId;
    private String password;
    private String linkedBank;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
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

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }
    public String getUpiId() {
        return upiId;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public void setLinkedBank(String linkedBank) {
        this.linkedBank = linkedBank;
    }
    public String getLinkedBank() {
        return linkedBank;
    }
}
