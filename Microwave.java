class Microwave {
    static boolean isConnected = false;
    static int powerLevel = 5, maxPower = 10, minPower = 1;

   public static void onOrOff() {
    if (isConnected == true) {
        isConnected = false;
        System.out.println("Microwave is now OFF");
    } else {
        isConnected = true;
        System.out.println("Microwave is now ON");
    }
}


   public static void increasePower() {
    if (isConnected == false) {
        System.out.println("Microwave is OFF.");
    } else if (powerLevel < maxPower) {
        powerLevel++;
        System.out.println("Power level increased to " + powerLevel);
    } else {
        System.out.println("Max power level reached.");
    }
}


   public static void decreasePower() {
    if (isConnected == false) {
        System.out.println("Microwave is OFF.");
    } else if (powerLevel > minPower) {
        powerLevel--;
        System.out.println("Power level decreased to " + powerLevel);
    } else {
        System.out.println("Min power level reached.");
    }
}
}