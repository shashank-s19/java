package com.xworkz.supermarketapp.supermarket;


import com.xworkz.supermarketapp.section.Section;

public class SuperMarket {
        public int marketId;
        public String marketName;
        public Section[] sections;

        public void showMarketDetails() {
            System.out.println("Market ID: " + marketId);
            System.out.println("Market Name: " + marketName);
            System.out.println("Sections in the market: ");
            for (Section section : sections) {
                section.showSectionDetails();
            }
        }}



