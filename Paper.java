class Paper {
    int id;
    String type;
    String category;
    double weight;
    String color;
    boolean isGlossy;
    String material;

    Paper() {
        this("A4", "Recycled");
    }

    Paper(String type, String category) {
        this(101);
        this.type = type;
        this.category = category;
    }

    Paper(int id) {
        this(80.0, "White");
        this.id = id;
    }

    Paper(double weight, String color) {
        this(true);
        this.weight = weight;
        this.color = color;
    }

    Paper(boolean isGlossy) {
        this("Glossy Paper");
        this.isGlossy = isGlossy;
    }

    Paper(String type) {
        this("Paper Material",2);
        this.type = type;
    }

    Paper(String material,int id) {
        this.material = material;
        
    }

    void displayDetails() {
        System.out.println("Paper ID: " + id);
        System.out.println("Type: " + type);
        System.out.println("Category: " + category);
        System.out.println("Weight: " + weight + " GSM");
        System.out.println("Color: " + color);
        System.out.println("Is Glossy: " + isGlossy);
        System.out.println("Material: " + material);
    }
}

