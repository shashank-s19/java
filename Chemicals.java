class Chemicals{
    int id;
    String name;
    String formula;
    double weight;
    boolean isToxic;
    String category;
    String state;

    Chemicals() {
        this("Water", "H2O");
    }

    Chemicals(String name, String formula) {
        this(101);
        this.name = name;
        this.formula = formula;
    }

    Chemicals(int id) {
        this(18.015, true);
        this.id = id;
    }

    Chemicals(double weight, boolean isToxic) {
        this("Organic");
        this.weight = weight;
        this.isToxic = isToxic;
    }

    Chemicals(String category) {
        this("Solid",2);
        this.category = category;
    }

    Chemicals(String name,int id) {
        this(true);
        this.name = name;
    }

    Chemicals(boolean isToxic) {
        this.isToxic=isToxic;
        
    }

    void displayDetails() {
        System.out.println("Chemical ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Formula: " + formula);
        System.out.println("Weight: " + weight + " g/mol");
        System.out.println("Is Toxic: " + isToxic);
        System.out.println("Category: " + category);
        System.out.println("State: " + state);
    }
}

