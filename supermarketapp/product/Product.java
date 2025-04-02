package com.xworkz.supermarketapp.product;

public class Product {


        public int productId;
        public String productName;
        public String[] ingredients;

        public void showProductDetails() {
            System.out.println("Product ID: " + productId);
            System.out.println("Product Name: " + productName);
            System.out.println("Ingredients: ");
            for (String ingredient : ingredients) {
                System.out.println(ingredient);
            }
        }
    }


