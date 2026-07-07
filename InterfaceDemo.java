// Interface 1
interface CafeRacer {
    void clipOnHandlebars();
}

// Interface 2
interface Bobber {
    void singleSeat();
}

// Class implementing CafeRacer interface
class GT650 implements CafeRacer {
    public void clipOnHandlebars() {
        System.out.println("Continental GT 650 has low clip-on handlebars for racing.");
    }
}

// Class implementing Bobber interface
class Shotgun650 implements Bobber {
    public void singleSeat() {
        System.out.println("Shotgun 650 features a cool, modular single seat.");
    }
}

// Main Class
public class InterfaceDemo {
    public static void main(String[] args) {
        GT650 gt = new GT650();
        Shotgun650 sg = new Shotgun650();

        gt.clipOnHandlebars();
        sg.singleSeat();
    }
}