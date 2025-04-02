package com.xworkz.supermarketapp;

import com.xworkz.supermarketapp.product.Product;
import com.xworkz.supermarketapp.section.Section;
import com.xworkz.supermarketapp.supermarket.SuperMarket;

public class SuperMarketRunner {
    public static void main(String[] args) {

        String[] teaIngredients = {"Milk", "Tea Powder", "Sugar", "Ginger"};
        String[] cakeIngredients = {"Flour", "Sugar", "Eggs", "Baking Powder"};
         Product [] product=new Product[2];


        Product tea = new Product();
        tea.productId = 101;
        tea.productName = "Tea";
        tea.ingredients = teaIngredients;

        Product cake = new Product();
        cake.productId = 102;
        cake.productName = "Cake";
        cake.ingredients = cakeIngredients;
        product[0]=tea;
        product[1]=cake;

         Section [] sections=new Section[2];
         Section beverages = new Section();
        beverages.sectionId = 1;
        beverages.sectionName = "Beverages";
        beverages.products = product;


        Section bev = new Section();
        bev.sectionId = 3;
        bev.sectionName = "Beverages1";
        bev.products = product;
        sections[0]=beverages;
        sections[1]=bev;

        SuperMarket superMarket = new SuperMarket();
        superMarket.marketId = 1;
        superMarket.marketName = "XWork";
        superMarket.sections=sections;

        superMarket.showMarketDetails();
    }}


