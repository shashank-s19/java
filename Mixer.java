class Mixer {
    static boolean isConnected = false;
    static int speed = 1;
	static int maxSpeed = 10;
static int	minSpeed = 1;

    public static void onOrOff() {
        if (isConnected) {
            isConnected = false;
            System.out.println("Mixer is now OFF");
        } else {
            isConnected = true;
            System.out.println("Mixer is now ON");
        }
    }

    public static void increaseSpeed() {
        if (!isConnected) {
            System.out.println("Mixer is OFF.");
        } else if (speed < maxSpeed) {
            speed++;
            System.out.println("Speed increased to " + speed);
        } else {
            System.out.println("Max speed reached.");
        }
    }

    public static void decreaseSpeed() {
        if (!isConnected) {
            System.out.println("Mixer is OFF.");
        } else if (speed > minSpeed) {
            speed--;
            System.out.println("Speed decreased to " + speed);
        } else {
            System.out.println("Min speed reached.");
        }
    }
}
