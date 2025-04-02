package com.xworkz.first;

import com.xworkz.first.actor.Actor;
import com.xworkz.first.movie.Movie;
import com.xworkz.first.moviemanager.MovieManager;

public class MovieRunner {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.movieId = 1;
        movie.movieName = "The Dark Knight";

        MovieManager movieManager = new MovieManager();
        movieManager.managerId = 1;
        movieManager.managerName = "Christopher";

        String[] actorNamesList1 = {"Christian Bale", "Heath Ledger", "Michael Caine"};
        String[] actorNamesList2 = {"Gary Oldman", "Morgan Freeman"};
        Actor[] actors = new Actor[2];

        Actor actor1 = new Actor();
        actor1.actorId = 1;
        actor1.actorNames = actorNamesList1;
        actors[0] = actor1;

        Actor actor2 = new Actor();
        actor2.actorId = 2;
        actor2.actorNames = actorNamesList2;
        actors[1] = actor2;

        movieManager.actors = actors;
        movie.manager = movieManager;

        movie.fetchDetails();
}
}


