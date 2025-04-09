package com.xworkz.bmtc;

public class KsrtcRunner {
    public static void main(String[] args) {
        com.xworkz.bmtc.bmtcdto.KsrtcDto dto = new com.xworkz.bmtc.bmtcdto.KsrtcDto();
        dto.setFullName("Shashank");

        dto.setMobileNumber("63624190707");

        dto.setEmail("shashank@gmail.com");

        dto.setPassword("ksrtc@2025");

        dto.setAadharNumber("958076504367");

        com.xworkz.bmtc.bmtcapp.KsrtcApp app = new com.xworkz.bmtc.bmtcapp.KsrtcApp();
        app.registerUser(dto);
        app.showDetails();
    }
}
