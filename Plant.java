class Plant {
	static	int id = 1;
     static   String name = "Rose";
     static   String species = "Rosissum";
     static   String sunlightRequirement = "Full Sun";
     static   boolean isIndoorFriendly = true;

    public static void main(String[] args) {
        //int id = 1;
       // String name = "Rose";
       // String species = "Rosissum";
       // String sunlightRequirement = "Full Sun";
       // boolean isIndoorFriendly = true;

        System.out.println("Plant ID is: " + id);
        System.out.println("Plant name is: " + name);
        System.out.println("Plant species is: " + species);
        System.out.println("Plant sunlight requirement is: " + sunlightRequirement);
        System.out.println("Is it indoor-friendly: " + isIndoorFriendly);
		
		updatePlant1();
		
		System.out.println("After update");
		System.out.println("Plant ID is: " + id);
        System.out.println("Plant name is: " + name);
        System.out.println("Plant species is: " + species);
        System.out.println("Plant sunlight requirement is: " + sunlightRequirement);
        System.out.println("Is it indoor-friendly: " + isIndoorFriendly);
		
    }
	public static void updatePlant1(){
	int id = 2;
       String name = "Lotus";
       String species = "Rosissum";
       String sunlightRequirement = "Full moon";
      boolean isIndoorFriendly = true;
	}
	
}