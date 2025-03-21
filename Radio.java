class Radio {
    static boolean isConnected = false;
    static int volume = 5, maxVolume = 10, minVolume = 0;

    public static void onOrOff() {
        if (isConnected) {
            isConnected = false;
            System.out.println("Radio is now OFF");
        } else {
            isConnected = true;
            System.out.println("Radio is now ON");
        }
    }

    public static void increaseVolume() {
        if (!isConnected) {
            System.out.println("Radio is OFF.");
        } else if (volume < maxVolume) {
            volume++;
            System.out.println("Volume increased to " + volume);
        } else {
            System.out.println("Max volume reached.");
        }
    }

    public static void decreaseVolume() {
        if (!isConnected) {
            System.out.println("Radio is OFF.");
        } else if (volume > minVolume) {
            volume--;
            System.out.println("Volume decreased to " + volume);
        } else {
            System.out.println("Min volume reached.");
        }
    }
}
