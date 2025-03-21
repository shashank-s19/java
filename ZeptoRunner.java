public class ZeptoRunner {
    public static void main(String ref[]) {
        double MuttonPrice = Zepto.search("mutton biryani");
        double Price = Zepto.search("paneer tikka");
        double nullPrice = Zepto.search(null);
       

        System.out.println("Price of Dosa: Rs." + MuttonPrice);
        System.out.println("Price of Idli: Rs." + Price);
        System.out.println("Price of Vada: Rs." + nullPrice);
      
    }
}
 