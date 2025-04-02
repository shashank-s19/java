package com.xworkz.GYMapp.fitnesscenter;

import com.xworkz.GYMapp.GYMmanager.GYMManager;

public class FitnessCenter {
        public int centerId;
        public String centerName;
        public GYMManager manager;

        public void fetchDetails(){
            System.out.println("Fitness Center ID is " + centerId);
            System.out.println("Fitness Center Name is " + centerName);
            System.out.println("Manager details are: ");
            manager.getDetails();
        }
    }


