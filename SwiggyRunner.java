class SwiggyRunner {
    public static void main(String ref[]) {
        double dosaPrice = Swiggy.search("Dosa");
        double idliPrice = Swiggy.search("Idli");
        double vadaPrice = Swiggy.search("Vada");
        double pizzaPrice = Swiggy.search("Pizza");
        double upmaPrice = Swiggy.search("Upma");

        System.out.println("Price of Dosa: Rs." + dosaPrice);
        System.out.println("Price of Idli: Rs." + idliPrice);
        System.out.println("Price of Vada: Rs." + vadaPrice);
        System.out.println("Price of Pizza: Rs." + pizzaPrice);
        System.out.println("Price of Upma: Rs." + upmaPrice);
    }
}
