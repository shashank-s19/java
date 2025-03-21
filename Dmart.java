class Dmart{
 static String snacks[]={"bingo","madangles","snikers","dairymilk","lays"};
 static String alcohols[]={"ballentine","100pepers", "jack deniels"};
 static String vegetables[]={"cucumber","raddish","carrot"};
	public static void main(String data[]){
		System.out.println("start of main():");
		getDmart();
		System.out.println("end of the main():");
	}
		
		//System.out.println("total no of snacks added:" + snacks.length); 
		//System.out.println("snacks avaliable are:" + snacks[0] +"," + snacks[1]+"," +snacks[2]+ ","+snacks[3]+ ","+snacks[4]);
		
		//System.out.println("the total no of alcohols addeded are :"+alcohols.length);
		//System.out.println("alcohols avaliable are:" +alcohols[0]+","+alcohols[1]+","+alcohols[2]);
		
		//System.out.println("total number of vegetables avaiable "+ vegetables.length);
		//System.out.println("vegetables avaiable are :"+vegetables[0]+","+vegetables[1]+","+vegetables[2]);
		public static void getDmart(){
			System.out.println("start of getDmart():");
		for(String snack:snacks){
			System.out.println(snack);
		}
		for(String alcohol:alcohols){
			System.out.println(alcohol);
		}
		for(String vegetable:vegetables){
			System.out.println(vegetable);
		}
		System.out.println("end of getDmart():");
		
	}
	
	

}