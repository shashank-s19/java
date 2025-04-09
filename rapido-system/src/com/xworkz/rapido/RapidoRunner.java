package com.xworkz.rapido;

import com.xworkz.rapido.rapidoapp.RapidoApp;
import com.xworkz.rapido.rapidodto.RapidoDto;

public class RapidoRunner {

    public static void main(String[] args) {
        RapidoDto rapidoDto = new RapidoDto();
        rapidoDto.setFullName("charan");
        rapidoDto.setMobileNumber("9876543210");
        rapidoDto.setEmail("charan@gmail.com");
        rapidoDto.setPassword("charan@123");
        rapidoDto.setPickupLocation(" Chennai");

        RapidoApp rapidoApp = new RapidoApp();
        rapidoApp.userRegistered(rapidoDto);
        rapidoApp.fetchDetails();
    }
}