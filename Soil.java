class Soil {
    int id;
    String soilType;
    String location;
    int depth;
    double pHLevel;
    boolean isFertile;
    
    Soil() {
        this("Clay Soil", "Farm Land");
    }

    Soil(String soilType, String location) {
        this(101);
        this.soilType = soilType;
        this.location = location;
    }
    
    Soil(int id) {
        this(50, true);
        this.id = id;
    }
    
    Soil(int depth, boolean isFertile) {
        this(6.5);
        this.depth = depth;
        this.isFertile = isFertile;
    }
    
    Soil(double pHLevel) {
        this("Loamy Soil");
        this.pHLevel = pHLevel;
    }
    
    Soil(String soilType) {
        this(true);
        this.soilType = soilType;
    }
    
    Soil(boolean isFertile) {
        this.isFertile = isFertile;
    }
    
    void displayDetails() {
        System.out.println("Soil ID: " + id);
        System.out.println("Soil Type: " + soilType);
        System.out.println("Location: " + location);
        System.out.println("Depth: " + depth);
        System.out.println("pH Level: " + pHLevel);
        System.out.println("Fertile: " + isFertile);
    }
}