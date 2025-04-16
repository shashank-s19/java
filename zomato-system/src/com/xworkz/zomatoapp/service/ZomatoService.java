package com.xworkz.zomatoapp.service;

import com.xworkz.zomatoapp.user.ZomatoUser;

public class ZomatoService {
    public boolean isRegistered(ZomatoUser user) {
        return isValid(user);
    }

    private boolean isValid(ZomatoUser user) {
        boolean isValid = true;

        if (user.getName() == null) {
            System.out.println("Name is missing");
            isValid = false;
        }
        if (user.getCity() == null) {
            System.out.println("City is missing");
            isValid = false;
        }
        if (user.getPhoneNumber() == null) {
            System.out.println("Phone number is missing");
            isValid = false;
        }
        if (user.getFavoriteCuisine() == null) {
            System.out.println("Favorite cuisine is missing");
            isValid = false;
        }

        return isValid;
    }

}
