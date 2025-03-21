class Projector {
    static boolean isConnected = false;
    static int brightness = 50;
    static int maxBrightness = 100;
    static int minBrightness = 10;

    public static void onOrOff() {
        if (isConnected) {
            isConnected = false;
            System.out.println("Projector is now OFF");
        } else {
            isConnected = true;
            System.out.println("Projector is now ON");
        }
    }

    public static void increaseBrightness() {
        if (!isConnected) {
            System.out.println("Projector is OFF.");
        } else if (brightness < maxBrightness) {
            brightness++;
            System.out.println("Brightness increased to " + brightness);
        } else {
            System.out.println("Max brightness reached.");
        }
    }

    public static void decreaseBrightness() {
        if (!isConnected) {
            System.out.println("Projector is OFF.");
        } else if (brightness > minBrightness) {
            brightness--;
            System.out.println("Brightness decreased to " + brightness);
        } else {
            System.out.println("Min brightness reached.");
        }
    }
}
