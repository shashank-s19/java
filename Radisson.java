class Radisson{
	static String menus[]={"pasta","hotdog","dosa","idle vada","upma","poori","rice bath","south meals","north meals","punjab meals"};
	public static void main(String hotel[]){
		System.out.println("main start():");
		getRadisson();
		System.out.println("end main():");
	}
		//System.out.println("the total no of food added are:" +menus.length);
		//System.out.println("the foods avaliable are :"+menus[0]+","+menus[1]+","+menus[2]+","+menus[3]+","+menus[4]+","+menus[5]+","+menus[6]+","+menus[7]+","+menus[8]+","+menus[9]+".");
		public static void getRadisson(){
			System.out.println("start of getRadisson():");
		for(String menu:menus){
			System.out.println(menu);
		}
		System.out.println("end of getRadisson():");
	}
}