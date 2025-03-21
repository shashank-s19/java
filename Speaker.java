class Speaker {
    static boolean isConnected = false;
    static int volume = 10, maxVolume = 100, minVolume = 0;

    public static void onOrOff() {
        isConnected = !isConnected;
        System.out.println("Speaker is now " + (isConnected ? "ON" : "OFF"));
    }

    public static void increaseVolume() {
        if (isConnected && volume < maxVolume) {
            System.out.println("Volume increased to " + (++volume));
        } else {
            System.out.println(isConnected ? "Max volume reached." : "Speaker is OFF.");
        }
    }

    public static void decreaseVolume() {
        if (isConnected && volume > minVolume) {
            System.out.println("Volume decreased to " + (--volume));
        } else {
            System.out.println(isConnected ? "Min volume reached." : "Speaker is OFF.");
        }
    }
}
