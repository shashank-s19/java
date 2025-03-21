class Iron {
    static boolean isConnected = false;
    static int temperature = 100, maxTemperature = 200, minTemperature = 50;

    public static void onOrOff() {
        if (isConnected) {
            isConnected = false;
            System.out.println("Iron is now OFF");
        } else {
            isConnected = true;
            System.out.println("Iron is now ON");
        }
    }

    public static void increaseTemperature() {
        if (!isConnected) {
            System.out.println("Iron is OFF.");
        } else if (temperature < maxTemperature) {
            temperature += 10;
            System.out.println("Temperature increased to " + temperature + "C");
        } else {
            System.out.println("Max temperature reached.");
        }
    }

    public static void decreaseTemperature() {
        if (!isConnected) {
            System.out.println("Iron is OFF.");
        } else if (temperature > minTemperature) {
            temperature -= 10;
            System.out.println("Temperature decreased to " + temperature + "C");
        } else {
            System.out.println("Min temperature reached.");
        }
    }
}
