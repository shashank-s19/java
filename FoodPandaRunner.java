public class FoodPandaRunner {
    public static void main(String[] args) {
        String item1 = "chicken biryani";
        double price1 = FoodPanda.search(item1);
        System.out.println(item1 + " - " + price1);

        String item2 = "paneer butter masala";
        double price2 = FoodPanda.search(item2);
        System.out.println(item2 + " - " + price2);

        String item3 = "butter naan";
        double price3 = FoodPanda.search(item3);
        System.out.println(item3 + " - " + price3);

        String item4 = "hakka noodles";
        double price4 = FoodPanda.search(item4);
        System.out.println(item4 + " - " + price4);

        String item5 = "chicken curry";
        double price5 = FoodPanda.search(item5);
        System.out.println(item5 + " - " + price5);
    }
}