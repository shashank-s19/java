package com.xworkz.GYMapp.trainer;

public class Trainer {

        public int trainerId;
        public String[] trainerNames;

        public void showDetails(){
            System.out.println("Trainer id is " + trainerId);
            for(String trainerDetail : trainerNames){
                System.out.println(trainerDetail);
            }
        }
    }


