package com.xworkz.phonepe;

import com.xworkz.phonepe.phonepedto.PhonePeDto;
import com.xworkz.phonepe.phonepeapp.PhonePeApp;

public class PhonePeRunner {
    public static void main(String[] args) {
        PhonePeDto dto = new PhonePeDto();



        dto.setFullName("shashank");
        dto.setEmail("shashank@gmail.com");

        dto.setMobileNumber("6362419707");

        dto.setUpiId("shashank@ybl");

        dto.setPassword("shashank@321");

        dto.setLinkedBank("SBI Bank");

        PhonePeApp app = new PhonePeApp();
        app.register(dto);
        app.showDetails();
    }
}
