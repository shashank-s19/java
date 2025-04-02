package com.xworkz.showroomapp.showroom;

import com.xworkz.showroomapp.Manager.Manager;

public class Showroom {
    public int showroomId;
   public String showroomName;
   public Manager manager;

   public  void fetchDetails(){
       System.out.println("showroom id is"+showroomId);
       System.out.println("showroom name is"+showroomName);
       System.out.println("showroom manager details are :");
       manager.getDetails();
   }

}
