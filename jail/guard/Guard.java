package com.xworkz.jail.guard;

public class Guard {
    public int guardId;
    public String[] guardNames;

    public void showDetails() {
        System.out.println("Guard ID is " + guardId);
        for (String guardName : guardNames) {
            System.out.println(guardName);
        }
    }
}

