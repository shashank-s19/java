package com.xworkz.first.moviemanager;

import com.xworkz.first.actor.Actor;

public class MovieManager {
    public int managerId;
    public String managerName;
    public Actor[] actors;

    public void getDetails(){
        System.out.println("Movie Manager ID is " + managerId);
        System.out.println("Movie Manager Name is " + managerName);
        System.out.println("Actor details are: ");
        for(Actor actor : actors){
            actor.showDetails();
        }
}
}
