class FoodPanda {
    public static double search(String foodName) {
        double price = 0.0;

        if (foodName.equals("chicken biryani")) {
            price = 250.00;
            return price;
        } else if (foodName.equals("mutton biryani")) {
            price = 320.00;
            return price;
        } else if (foodName.equals("veg biryani")) {
            price = 180.00;
            return price;
        } else if (foodName.equals("paneer butter masala")) {
            price = 240.00;
            return price;
        } else if (foodName.equals("dal makhani")) {
            price = 180.00;
            return price;
        } else if (foodName.equals("rajma chawal")) {
            price = 150.00;
            return price;
        } else if (foodName.equals("chole bhature")) {
            price = 140.00;
            return price;
        } else if (foodName.equals("pav bhaji")) {
            price = 110.00;
            return price;
        } else if (foodName.equals("butter naan")) {
            price = 40.00;
            return price;
        } else if (foodName.equals("garlic naan")) {
            price = 50.00;
            return price;
        } else if (foodName.equals("tandoori roti")) {
            price = 30.00;
            return price;
        } else if (foodName.equals("chicken curry")) {
            price = 280.00;
            return price;
        } else if (foodName.equals("mutton curry")) {
            price = 350.00;
            return price;
        } else if (foodName.equals("butter chicken")) {
            price = 300.00;
            return price;
        } else if (foodName.equals("tandoori chicken")) {
            price = 400.00;
            return price;
        } else if (foodName.equals("fish curry")) {
            price = 280.00;
            return price;
        } else if (foodName.equals("egg curry")) {
            price = 150.00;
            return price;
        } else if (foodName.equals("dal tadka")) {
            price = 140.00;
            return price;
        } else if (foodName.equals("jeera rice")) {
            price = 120.00;
            return price;
        } else if (foodName.equals("veg fried rice")) {
            price = 160.00;
            return price;
        } else if (foodName.equals("chicken fried rice")) {
            price = 220.00;
            return price;
        } else if (foodName.equals("paneer fried rice")) {
            price = 200.00;
            return price;
        } else if (foodName.equals("spring roll")) {
            price = 100.00;
            return price;
        } else if (foodName.equals("veg momos")) {
            price = 120.00;
            return price;
        } else if (foodName.equals("chicken momos")) {
            price = 150.00;
            return price;
        } else if (foodName.equals("hakka noodles")) {
            price = 140.00;
            return price;
        } else if (foodName.equals("schezwan noodles")) {
            price = 160.00;
            return price;
        } else if (foodName.equals("manchurian")) {
            price = 180.00;
            return price;
        } else if (foodName.equals("gobi 65")) {
            price = 140.00;
            return price;
        } else if (foodName.equals("chilli paneer")) {
            price = 200.00;
            return price;
        } else if (foodName.equals("chilli chicken")) {
            price = 250.00;
            return price;
        } else if (foodName.equals("malai kofta")) {
            price = 230.00;
            return price;
        } else if (foodName.equals("lassi")) {
            price = 80.00;
            return price;
        } else if (foodName.equals("jalebi")) {
            price = 90.00;
            return price;
        } else if (foodName.equals("gulab jamun")) {
            price = 70.00;
            return price;
        } else if (foodName.equals("rasgulla")) {
            price = 75.00;
            return price;
        } else if (foodName.equals("ice cream")) {
            price = 100.00;
            return price;
        } 
        else if (foodName.equals("Dessert")) {
            price = 99.00;
            return price;
        } else if (foodName.equals("yogurt")) {
            price = 100.00;
            return price;
        } else if (foodName.equals("Jamun")) {
            price = 110.00;
            return price;
        } else if (foodName.equals("egg omlet")) {
            price = 40.00;
            return price;
        }else {
            System.out.println("Food not found!!!");
        }
        return price;
    }
}