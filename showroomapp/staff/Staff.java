package com.xworkz.showroomapp.staff;

public class Staff {
   public int staffId;

  public  String [] staffNames;
  public void showDetails(){
      System.out.println("staff id is "+staffId);
      for(String staffdetails:staffNames){
          System.out.println(staffdetails);
      }
  }

}
