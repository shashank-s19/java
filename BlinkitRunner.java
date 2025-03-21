class BlinkitRunner {
    public static void main(String[] args) {
        String item1 = "atta 5kg";
        double price1 = Blinkit.search(item1);
        System.out.println(item1 + " - " + price1);

        String item2 = "basmati rice 5kg";
        double price2 = Blinkit.search(item2);
        System.out.println(item2 + " - " + price2);

        String item3 = "mustard oil 1L";
        double price3 = Blinkit.search(item3);
        System.out.println(item3 + " - " + price3);

        String item4 = "paneer 250g";
        double price4 = Blinkit.search(item4);
        System.out.println(item4 + " - " + price4);

        String item5 = "chicken 1kg";
        double price5 = Blinkit.search(item5);
        System.out.println(item5 + " - " + price5);
		 String item6 = null;
        double price6 = Blinkit.search(item6);
        System.out.println(item6 + " - " + price6);
    }
}