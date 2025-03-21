class LuluHyperMarket{
	static String groceries[]={"honey","sugar","eggs","nuts","rice","flour","pasta","bread","pepper","seeds"};
	static String utensils[]={" Knife","Cutting Board","Spatula","Ladle","Peeler","Grater","Mixing Bowls","Measuring Cups","Rolling Pin"," Pans"};
	static String perfumes[]={"Giorgio Armani Acqua Di Gio Parfum","Dior Sauvage Eau de Parfum","Versace Eros Parfum Spray Men","Jaguar Classic Black EDT","Hugo Boss Bottled","Jean Paul Gaultier","Le Labo Another 13","Polo Black Eau de Toilette","Prada Luna Rossa Sport edt","Dior Homme Eau De Toilette Spray"};
	static String biscuits []={"oreo","jimjam","hide&seek","bourbon","darkfantasy","milkbikis","manaco","parle-g","unibic","good day"};
	static String vegetables[]={"Carrots","Broccoli","Onions","Asparagus","Eggplants","Cabbage","Corn","Tomatoes","Artichoke","cucumbers"};
	public static void main(String market[]){
		System.out.println("start of main():");
		getLuluhyperMarket();
		System.out.println("end of main():");
	}
		//System.out.println("the groceries avaliable are:"+groceries[0]+","+groceries[1]+","+groceries[2]+","+groceries[3]+","+groceries[4]+","+groceries[5]+","+groceries[6]+","+groceries[7]+","+groceries[8]+","+groceries[9]+".");	
		//System.out.println("the perfumes avaliable are:"+perfumes[0]+","+perfumes[1]+","+perfumes[2]+","+perfumes[3]+","+perfumes[4]+","+perfumes[5]+","+perfumes[6]+","+perfumes[7]+","+perfumes[8]+","+perfumes[9]+".");	
		//System.out.println("the biscuits avaliable are:"+biscuits[0]+","+biscuits[1]+","+biscuits[2]+","+biscuits[3]+","+biscuits[4]+","+biscuits[5]+","+biscuits[6]+","+biscuits[7]+","+biscuits[8]+","+biscuits[9]+".");
		//System.out.println("the utensils avaliable are:"+utensils[0]+","+utensils[1]+","+utensils[2]+","+utensils[3]+","+utensils[4]+","+utensils[5]+","+utensils[6]+","+utensils[7]+","+utensils[8]+","+utensils[9]+".");	
		//System.out.println("the vegetables avaliable are:"+vegetables[0]+","+vegetables[1]+","+vegetables[2]+","+vegetables[3]+","+vegetables[4]+","+vegetables[5]+","+vegetables[6]+","+vegetables[7]+","+vegetables[8]+","+vegetables[9]+".");
		public static void getLuluhyperMarket(){
			System.out.println("start of getLuluhyperMarket():");
		for(String groceri:groceries){
			System.out.println(groceri);
			
		}
		for(String biscuit:biscuits){
			System.out.println(biscuit);
		}
		for(String utensil:utensils){
			System.out.println(utensil);
		}
		for(String vegetable:vegetables){
			System.out.println(vegetable);
		}
		System.out.println("end of the getLuluhyperMarket():");
	}
	


}