class Ac{
	static boolean isConnected = false ;
	static int temperature;
	static int maxTemperature = 6;
	static int mintemperature ;
	
	
	
	public static void onOrOff(){
		if(isConnected == false){
			isConnected = true;
			System.out.println("Ac is on");
		}else{
			isConnected = false ;
			System.out.println("Ac is Off");
		}
	}
	public static void  increaseTemp(){
	    if(isConnected == true){
			if(temperature >  maxTemperature){
				System.out.println("Maximum temperature");
			}else{
				temperature = temperature++;
				System.out.println("Temperature is :"+temperature);
			}
		}
			if(isConnected == false){
				System.out.println("Please turnon the AC");
				//void isConnected()
			}
		
			
		}
	
	
	public static void decreaseTemp(){
		if(isConnected == true){
			if(temperature < mintemperature){
				System.out.println("Minimum temperature");
			}else{
				 temperature = temperature--;
				System.out.println("Temperature is :"+temperature);
			}
		}
		if(isConnected == false){
			System.out.println("Please turnon the AC");
		}
	}



} 