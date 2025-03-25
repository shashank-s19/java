class House {
    int id;
    String address;
    String type;
    double size;
    int rooms;
    boolean hasGarden;
    String owner;

    House() {
        this("123 Main St", "Apartment");
    }

    House(String address, String type) {
        this(101);
        this.address = address;
        this.type = type;
    }

    House(int id) {
        this(1200.5, 4);
        this.id = id;
    }

    House(double size, int rooms) {
        this(true);
        this.size = size;
        this.rooms = rooms;
    }

    House(boolean hasGarden) {
        this("John Doe");
        this.hasGarden = hasGarden;
    }

    House(String owner) {
        this("Villa", true);
        this.owner = owner;
    }

    House(String type, boolean hasGarden) {
        this.hasGarden=hasGarden;
        this.type = type;
    }

    void displayDetails() {
        System.out.println("House ID: " + id);
        System.out.println("Address: " + address);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size + " sq meters");
        System.out.println("Rooms: " + rooms);
        System.out.println("Has Garden: " + hasGarden);
        System.out.println("Owner: " + owner);
    }
}

