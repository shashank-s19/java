 class UberFoods {
    public static double search(String foodName) {
        double price = 0.0;
       

        if (foodName == "chicken biryani") {
            price = 260.00;
            return price;
        } else if (foodName == "mutton biryani") {
            price = 340.00;
            return price;
        } 
		else if (foodName == "egg biryani") {
            price = 220.00;
            return price;
        } 
		else if (foodName == "veg pulao") {
            price = 190.00;
            return price;
        } 
		
		else if (foodName == "paneer butter masala") {
            price = 250.00;
            return price;
        } 
		
		else if (foodName == "dal fry") {
            price = 180.00;
            return price;
        } 
		
		else if (foodName == "rajma chawal") {
            price = 160.00;
            return price;
        } 
		
		else if (foodName == "chole kulche") {
            price = 150.00;
            return price;
        } 
		
		else if (foodName == "pav bhaji") {
            price = 130.00;
            return price;
        } 
		
		else if (foodName == "tandoori roti") {
            price = 35.00;
            return price;
        }

		else if (foodName == "butter naan") {
            price = 45.00;
            return price;
        }

		else if (foodName == "garlic naan") {
            price = 55.00;
            return price;
        }

		else if (foodName == "butter chicken") {
            price = 310.00;
            return price;
        }
		else if (foodName == "chicken curry") {
            price = 290.00;
            return price;
        } 
		else if (foodName == "mutton curry") {
            price = 370.00;
            return price;
        }

		else if (foodName == "fish curry") {
            price = 290.00;
            return price;
        }

		else if (foodName == "egg curry") {
            price = 160.00;
            return price;
        } 
		
		else if (foodName == "dal tadka") {
            price = 150.00;
            return price;
        }

		else if (foodName == "jeera rice") {
            price = 130.00;
            return price;
        }

		else if (foodName == "veg fried rice") {
            price = 170.00;
            return price;
        }
		else if (foodName == "chicken fried rice") {
            price = 230.00;
            return price;
        } 
		
		else if (foodName == "paneer fried rice") {
            price = 210.00;
            return price;
        }

		else if (foodName == "spring roll") {
            price = 110.00;
            return price;
        }

		else if (foodName == "veg momos") {
            price = 130.00;
            return price;
        }

		else if (foodName == "chicken momos") {
            price = 160.00;
            return price;
        } 
		
		else if (foodName == "hakka noodles") {
            price = 150.00;
            return price;
        }

		else if (foodName == "schezwan noodles") {
            price = 170.00;
            return price;
        }

		else if (foodName == "manchurian") {
            price = 190.00;
            return price;
        }

		else if (foodName == "chilli paneer") {
            price = 210.00;
            return price;
        }

		else if (foodName == "chilli chicken") {
            price = 260.00;
            return price;
        }

		else if (foodName == "malai kofta") {
            price = 240.00;
            return price;
        }

		else if (foodName == "lassi") {
            price = 90.00;
            return price;
        }

		else if (foodName == "jalebi") {
            price = 100.00;
            return price;
        }

		else if (foodName == "gulab jamun") {
            price = 80.00;
            return price;
        }

		else if (foodName == "rasgulla") {
            price = 85.00;
            return price;
        }

		else if (foodName == "ice cream") {
            price = 110.00;
            return price;
        }

		else if (foodName == "brownie") {
            price = 120.00;
            return price;
        }

		else if (foodName == "milkshake") {
            price = 150.00;
            return price;
        }
		
		else if (foodName == "Chocolate") {
            price = 150.00;
            return price;
        }
		
		else if (foodName == "egg omlet") {
            price = 15.00;
            return price;
        }
		
		else if (foodName == "Oil Free egg omlet") {
            price = 40.00;
            return price;
        } 
		else {
            System.out.println("Food not found!!!");
        }
        return price;
    }
}
