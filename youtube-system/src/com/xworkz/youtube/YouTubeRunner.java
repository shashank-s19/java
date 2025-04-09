package com.xworkz.youtube;

import com.xworkz.youtube.youtubeapp.YouTubeApp;
import com.xworkz.youtube.youtubedto.YouTubeDto;

public class YouTubeRunner {

    public static void main(String[] args) {
        YouTubeDto youTubeDto = new YouTubeDto();
        youTubeDto.setFullName("shashank");
        youTubeDto.setMobileNumber("9123456789");
        youTubeDto.setEmail("shashank@gmail.com");
        youTubeDto.setPassword("shashank@2024");
        youTubeDto.setShippingAddress("mumbai, India");

        YouTubeApp youTubeApp = new YouTubeApp();
        youTubeApp.userRegistered(youTubeDto);
        youTubeApp.fetchDetails();
    }
}