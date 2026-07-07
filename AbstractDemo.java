// Abstract Parent Class
abstract class Bike {
    String name;

    Bike(String name) {
        this.name = name;
    }

    // Abstract method (has no body, must be implemented by subclasses)
    abstract void start();
}

// Subclass 1
class Hunter350 extends Bike {
    Hunter350() { super("Hunter 350"); }
    
    void start() {
        System.out.println(name + " starts with a sharp, sporty sound!");
    }
}

// Subclass 2
class Classic350 extends Bike {
    Classic350() { super("Classic 350"); }
    
    void start() {
        System.out.println(name + " starts with a heavy Dug-Dug thump!");
    }
}

// Subclass 3
class Himalayan450 extends Bike {
    Himalayan450() { super("Himalayan 450"); }
    
    void start() {
        System.out.println(name + " starts with a modern liquid-cooled roar!");
    }
}

// Main Class
public class AbstractDemo {
    public static void main(String[] args) {
        Bike b1 = new Hunter350();
        Bike b2 = new Classic350();
        Bike b3 = new Himalayan450();

        b1.start();
        b2.start();
        b3.start();
    }
}