package com.xworkz.spotify;

import com.xworkz.spotify.spotifyapp.SpotifyApp;
import com.xworkz.spotify.spotifydto.SpotifyDto;

public class SpotifyRunner {
    public static void main(String[] args) {
        SpotifyDto spotifyDto = new SpotifyDto();
        spotifyDto.setFullName("Shashank");

        spotifyDto.setMobileNumber("6362419707");

        spotifyDto.setEmail("shashank@gmail.com");

        spotifyDto.setPassword("shashank@123");

        spotifyDto.setShippingAddress("banglore, India");

        SpotifyApp spotifyApp = new SpotifyApp();
        spotifyApp.userRegistered(spotifyDto);
        spotifyApp.fetchDetails();
    }
}