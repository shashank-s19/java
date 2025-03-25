class Glass {
    int id;
    String type;
    String color;
    double thickness;
    boolean isTempered;
    String manufacturer;
    String shape;

    Glass() {
        this("Clear", "Square");
    }

    Glass(String type, String shape) {
        this(101);
        this.type = type;
        this.shape = shape;
    }

    Glass(int id) {
        this(5.0, true);
        this.id = id;
    }

    Glass(double thickness, boolean isTempered) {
        this("Glass Manufacturer");
        this.thickness = thickness;
        this.isTempered = isTempered;
    }

    Glass(String manufacturer) {
        this("Transparent",5);
        this.manufacturer = manufacturer;
    }

    Glass(String type,int id) {
        this(20.3);
        this.type = type;
    }

    Glass(double thickness) {
       this.thickness=thickness;
    }

    void displayDetails() {
        System.out.println("Glass ID: " + id);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Thickness: " + thickness + " mm");
        System.out.println("Is Tempered: " + isTempered);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Shape: " + shape);
    }
}

