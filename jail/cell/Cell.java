package com.xworkz.jail.cell;

public class Cell {
    public int cellId;
    public String cellType; // Could be 'Solitary', 'General', etc.
    public String[] inmates;

    public void showDetails() {
        System.out.println("Cell ID: " + cellId + ", Cell Type: " + cellType);
        System.out.println("Inmates in this cell:");
        for (String inmate : inmates) {
            System.out.println(inmate);
        }
    }
}




