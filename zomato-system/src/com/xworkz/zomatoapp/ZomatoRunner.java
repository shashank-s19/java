package com.xworkz.zomatoapp;

import com.xworkz.zomatoapp.service.ZomatoService;
import com.xworkz.zomatoapp.user.ZomatoUser;

public class ZomatoRunner {
    public static void main(String[] args) {
        ZomatoUser user = new ZomatoUser();
        user.setName("Shubha");
        user.setCity(City.BANGALORE);
        user.setPhoneNumber("9876543210");
        user.setFavoriteCuisine(CuisineType.SOUTH_INDIAN);

        ZomatoService service = new ZomatoService();
        if (service.isRegistered(user)) {
            System.out.println("Zomato registration successful");
        } else {
            System.out.println("Zomato registration failed");
        }
    }

}
