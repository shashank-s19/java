package com.workz.olafoodapp;

import com.workz.olafoodapp.OlaFoods.OlaFoods;
import com.workz.olafoodapp.Olafooddto.OlaFoodsDto;

public class OlaFoodsRunner {
    public static void main(String[] args) {
        OlaFoodsDto olaFoodsDto = new OlaFoodsDto();
        olaFoodsDto.setFullName("Shashank B S");
        olaFoodsDto.setMobileNumber("8887776665");
        olaFoodsDto.setEmail("Shashank@gmail.com");
        olaFoodsDto.setPassword("Shashank@123");
        olaFoodsDto.setDeliveryAddress("Bangalore, India");

        OlaFoods olaFoodsApp = new OlaFoods();
        olaFoodsApp.userRegistered(olaFoodsDto);
        olaFoodsApp.fetchDetails();
    }
}
