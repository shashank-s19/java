package com.xworkz.first.movie;

import com.xworkz.first.moviemanager.MovieManager;

public class Movie {
    public int movieId;
    public String movieName;
    public MovieManager manager;

    public void fetchDetails(){
        System.out.println("Movie ID is " + movieId);
        System.out.println("Movie Name is " + movieName);
        System.out.println("Movie Manager details are: ");
        manager.getDetails();
    }
}
