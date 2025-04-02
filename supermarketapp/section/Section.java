package com.xworkz.supermarketapp.section;

import com.xworkz.supermarketapp.product.Product;

public class Section {
    public int sectionId;
        public String sectionName;
        public Product[] products;

        public void showSectionDetails() {
            System.out.println("Section ID: " + sectionId);
            System.out.println("Section Name: " + sectionName);
            System.out.println("Products in this section: ");
            for (Product product : products) {
                product.showProductDetails();
            }
        }
    }


