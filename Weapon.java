class Weapon {
    int id;
    String weaponName;
    String type;
    int damage;
    double weight;
    boolean isAutomatic;
    
    Weapon() {
        this("Rifle", "Firearm");
    }

    Weapon(String weaponName, String type) {
        this(101);
        this.weaponName = weaponName;
        this.type = type;
    }
    
    Weapon(int id) {
        this(75, true);
        this.id = id;
    }
    
    Weapon(int damage, boolean isAutomatic) {
        this(3.5);
        this.damage = damage;
        this.isAutomatic = isAutomatic;
    }
    
    Weapon(double weight) {
        this("Pistol");
        this.weight = weight;
    }
    
    Weapon(String weaponName) {
        this(true);
        this.weaponName = weaponName;
    }
    
    Weapon(boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
    }
    
    void displayDetails() {
        System.out.println("Weapon ID: " + id);
        System.out.println("Weapon Name: " + weaponName);
        System.out.println("Type: " + type);
        System.out.println("Damage: " + damage);
        System.out.println("Weight: " + weight);
        System.out.println("Automatic: " + isAutomatic);
    }
}




