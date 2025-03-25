class Road {
    int id;
    String name;
    String type;
    double length;
    String surfaceType;
    boolean isPaved;
    String location;

    Road() {
        this("Main Street", "Asphalt");
    }

    Road(String name, String type) {
        this(101);
        this.name = name;
        this.type = type;
    }

    Road(int id) {
        this(500.0, "Concrete");
        this.id = id;
    }

    Road(double length, String surfaceType) {
        this(true);
        this.length = length;
        this.surfaceType = surfaceType;
    }

    Road(boolean isPaved) {
        this("Los Angeles");
        this.isPaved = isPaved;
    }

    Road(String location) {
        this("Highway",3);
        this.location = location;
    }

    Road(String name ,int id) {
        
        this.name = name;
        this.id=id;
    }

    void displayDetails() {
        System.out.println("Road ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Length: " + length + " km");
        System.out.println("Surface Type: " + surfaceType);
        System.out.println("Is Paved: " + isPaved);
        System.out.println("Location: " + location);
    }
}

class RoadRunner {
    public static void main(String[] args) {
        Road ref = new Road();
        ref.displayDetails();
    }
}
