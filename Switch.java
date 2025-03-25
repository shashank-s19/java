class Switch {
    int id;
    String type;
    String color;
    String material;
    boolean isSmart;
    double powerRating;
    String manufacturer;

    Switch() {
        this("Plastic", "White");
    }

    Switch(String type, String color) {
        this(101);
        this.type = type;
        this.color = color;
    }

    Switch(int id) {
        this(10.0, true);
        this.id = id;
    }

    Switch(double powerRating, boolean isSmart) {
        this("XYZ Corp");
        this.powerRating = powerRating;
        this.isSmart = isSmart;
    }

    Switch(String manufacturer) {
        this(10.0);
        this.manufacturer = manufacturer;
    }

    Switch(double powerRating) {
        this(true);
        this.type = type;
    }

    Switch(boolean isSmart) {
     this.isSmart=isSmart;
    }

    void displayDetails() {
        System.out.println("Switch ID: " + id);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Is Smart: " + isSmart);
        System.out.println("Power Rating: " + powerRating + " watts");
        System.out.println("Manufacturer: " + manufacturer);
    }
}

