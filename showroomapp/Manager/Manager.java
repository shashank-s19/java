package com.xworkz.showroomapp.Manager;

import com.xworkz.showroomapp.staff.Staff;

public class Manager {
   public int managerId;
   public String managerName;
  public  Staff staffs[];
  public void getDetails(){
      System.out.println("manager id is "+managerId);
      System.out.println("manager name is "+managerName);
      System.out.println("staff details are: ");
      for(Staff  st:staffs){
          st.showDetails();
      }
  }
}
