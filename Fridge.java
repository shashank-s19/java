class Fridge {
    static boolean isConnected = false;
    static int temperature = 4, maxTemperature = 8, minTemperature = 1;

    public static void onOrOff() {
        if (isConnected) {
            isConnected = false;
            System.out.println("Fridge is now OFF");
        } else {
            isConnected = true;
            System.out.println("Fridge is now ON");
        }
    }

    public static void increaseTemperature() {
        if (!isConnected) {
            System.out.println("Fridge is OFF.");
        } else if (temperature < maxTemperature) {
            temperature++;
            System.out.println("Temperature increased to " + temperature);
        } else {
            System.out.println("Max temperature reached.");
        }
    }

    public static void decreaseTemperature() {
        if (!isConnected) {
            System.out.println("Fridge is OFF.");
        } else if (temperature > minTemperature) {
            temperature--;
            System.out.println("Temperature decreased to " + temperature);
        } else {
            System.out.println("Min temperature reached.");
        }
    }
}
