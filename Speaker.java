class Speaker {
    static boolean isConnected = false;
    static int volume = 10; 
	static int maxVolume = 100;
    static	int minVolume = 0;

    public static void onOrOff() {
    if (isConnected == true) {
        isConnected = false;
        System.out.println("Speaker is now OFF");
    } else {
        isConnected = true;
        System.out.println("Speaker is now ON");
    }
}



    public static void increaseVolume() {
    if (!isConnected) {
        System.out.println("Speaker is OFF.");
    } else if (volume < maxVolume) {
        volume ++;
        System.out.println("Volume increased to " + volume);
    } else {
        System.out.println("Max volume reached.");
    }
}


   public static void decreaseVolume() {
    if (!isConnected) {
        System.out.println("Speaker is OFF.");
    } else if (volume > minVolume) {
        volume--;
        System.out.println("Volume decreased to " + volume);
    } else {
        System.out.println("Min volume reached.");
    }
}
}
