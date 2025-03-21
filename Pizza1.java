class Pizza1{
    static String name = "Veg Corn Pizza";
    static int price = 200;  
    static String quality = "Good";
    public static void main(String args[]) {
        System.out.println("Before Update:");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quality: " + quality);

        updatePizza();  

        System.out.println("\nAfter Update:");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
		}

    public static void updatePizza() {  
        name = "Non-Veg Pizza";
        price = 300;
        quality = "Fab";
    }
}	