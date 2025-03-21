class Products{
	static String items[]={ "Laptop", "Mobile", "Tablet", "Smartwatch", "Headphones", "Keyboard", "Mouse", "Monitor","Printer", "Scanner", "Chair", "Table", "Lamp", "Fan", "Sofa", "Bed", "Pillow", "Blanket","Cup", "Plate", "Bottle", "Shoes", "Shirt", "Jeans", "Jacket", "Bag", "Notebook", "Pen","Pencil", "Eraser", "Charger", "Adapter", "USB Cable", "Speaker", "Television", "phone","Calculator", "Clock", "Mirror", "Curtain"};
	public static void main(String item[]){
		System.out.println("start of main():");
		getProducts();
		System.out.println("end of main:()");
	}
		//System.out.println("the items avaliable are :"+items[0]+","+items[1]+","+items[2]+","+items[3]+","+items[4]+","+items[5]+","+items[6]+","+items[7]+","+items[8]+","+items[9]+","+items[10]+","+items[11]+","+items[12]+","+items[13]+","+items[14]+","+items[15]+","+items[16]+","+items[17]+","+items[18]+","+items[19]+","+items[20]+","+items[21]+","+items[22]+","+items[23]+","+items[24]+","+items[25]+","+items[26]+","+items[27]+","+items[28]+","+items[29]+","+items[30]+","+items[31]+","+items[32]+","+items[33]+","+items[34]+","+items[35]+","+items[36]+","+items[37]+","+items[38]+","+items[39]+".");
		public static void getProducts(){
			System.out.println("start of getProducts():");
			for(String product:items){
				System.out.println(product);
			}
			System.out.println("end of getProducts():");
	}
}