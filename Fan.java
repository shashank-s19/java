class Fan {
    static boolean isConnected = false;
    static int speed = 1, maxSpeed = 5, minSpeed = 0;

    public static void onOrOff() {
        if (isConnected) {
            isConnected = false;
            System.out.println("Fan is now OFF");
        } else {
            isConnected = true;
            System.out.println("Fan is now ON");
        }
    }

    public static void increaseSpeed() {
        if (!isConnected) {
            System.out.println("Fan is OFF.");
        } else if (speed < maxSpeed) {
            speed++;
            System.out.println("Speed increased to " + speed);
        } else {
            System.out.println("Max speed reached.");
        }
    }

    public static void decreaseSpeed() {
        if (!isConnected) {
            System.out.println("Fan is OFF.");
        } else if (speed > minSpeed) {
            speed--;
            System.out.println("Speed decreased to " + speed);
        } else {
            System.out.println("Min speed reached.");
        }
    }
}
