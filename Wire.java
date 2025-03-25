class Wire {
    int id;
    String material;
    double length;
    double diameter;
    boolean isConductive;
    String insulationType;

    Wire() {
        this("Copper", 100.0);
    }

    Wire(String material, double length) {
        this(201);
        this.material = material;
        this.length = length;
    }

    Wire(int id) {
        this(2.0, true);
        this.id = id;
    }

    Wire(double diameter, boolean isConductive) {
        this("PVC");
        this.diameter = diameter;
        this.isConductive = isConductive;
    }

    Wire(String insulationType) {
        this("Metallic Wire",1);
        this.insulationType = insulationType;
    }

    Wire(String material,int id) {
        this(true);
        this.material = material;
        this.id=id;
    }

    Wire(boolean isConductive) {
        
        this.isConductive=isConductive;
    }

    void displayDetails() {
        System.out.println("Wire ID: " + id);
        System.out.println("Material: " + material);
        System.out.println("Length: " + length );
        System.out.println("Diameter: " + diameter );
        System.out.println("Is Conductive: " + isConductive);
        System.out.println("Insulation Type: " + insulationType);
    }
}

