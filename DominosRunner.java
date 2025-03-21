public class DominosRunner {
    public static void main(String[] args) {
        String item1 = "margherita pizza";
        double price1 = Dominos.search(item1);
        System.out.println(item1 + " - " + price1);

        String item2 = "farmhouse pizza";
        double price2 = Dominos.search(item2);
        System.out.println(item2 + " - " + price2);

        String item3 = "peppy paneer pizza";
        double price3 = Dominos.search(item3);
        System.out.println(item3 + " - " + price3);

        String item4 = "chicken dominator pizza";
        double price4 = Dominos.search(item4);
        System.out.println(item4 + " - " + price4);

        String item5 = "veg extravaganza pizza";
        double price5 = Dominos.search(item5);
        System.out.println(item5 + " - " + price5);
    }
}