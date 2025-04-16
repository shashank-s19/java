package com.xworkz.zomatoapp.user;

import com.xworkz.zomatoapp.City;
import com.xworkz.zomatoapp.CuisineType;

public class ZomatoUser {
    private String name;
    private City city;
    private String phoneNumber;
    private CuisineType favoriteCuisine;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setCity(City city) {
        this.city = city;
    }
    public City getCity() {
        return city;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFavoriteCuisine(CuisineType favoriteCuisine) {
        this.favoriteCuisine = favoriteCuisine;
    }
    public CuisineType getFavoriteCuisine() {
        return favoriteCuisine;
    }
}
