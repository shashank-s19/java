public class FoodDeliveryRunner{
    public static void main(String[] args) {
        System.out.println(FoodDelivery.signUp("Shashank", "B S", "9876543210", "15-08-1996", "shashank@mail.com", "Male", "password123", "MG Road, Bangalore", "South Indian"));
        System.out.println(FoodDelivery.signUp("Rajesh", "Kumar", "8765432109", "25-12-1990", "rajesh@mail.com", "Male", "securePass", "T Nagar, Chennai", "North Indian"));
        System.out.println(FoodDelivery.signUp("Priya", "Sharma", "9988776655", "05-06-1995", "priya@mail.com", "Female", "priyaPass", "Andheri, Mumbai", "Chinese"));
    }
}