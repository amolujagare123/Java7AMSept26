package Inheritance.Overriding;
// Runtime Polymorphism (Method Overriding) - TV Showroom Example
// A parent-class reference (Showroom) can point to any child object (Onida, Samsung, LG).
// Which method runs is decided at RUNTIME, based on the actual object.

class Showroom {
    void channels() {
        System.out.println("Showroom: Generic channels");
    }

    void volumecontrol() {
        System.out.println("Showroom: Generic volume control");
    }

    void settings() {
        System.out.println("Showroom: Generic settings");
    }
}

class Onida extends Showroom {
    @Override
    void channels() {
        System.out.println("Onida: Showing Onida channels");
    }

    @Override
    void volumecontrol() {
        System.out.println("Onida: Onida volume control");
    }

    @Override
    void settings() {
        System.out.println("Onida: Onida settings menu");
    }
}

class Samsung extends Showroom {
    @Override
    void channels() {
        System.out.println("Samsung: Showing Samsung Smart channels");
    }

    @Override
    void volumecontrol() {
        System.out.println("Samsung: Samsung volume control");
    }

    @Override
    void settings() {
        System.out.println("Samsung: Samsung settings menu");
    }
}

class LG extends Showroom {
    @Override
    void channels() {
        System.out.println("LG: Showing LG webOS channels");
    }

    @Override
    void volumecontrol() {
        System.out.println("LG: LG volume control");
    }

    @Override
    void settings() {
        System.out.println("LG: LG settings menu");
    }
}

public class ShowroomDemo {
    public static void main(String[] args) {




        LG ob = new LG();

       // ob.channels();




        // Parent reference, child object (upcasting)
        Showroom s = new Onida();
        s.channels();
        s.volumecontrol();
        s.settings();

        System.out.println("-----------------------------");

        // Same reference, different object -> different behaviour
        s = new Samsung();
        s.channels();
        s.volumecontrol();
        s.settings();

        System.out.println("-----------------------------");

        s = new LG();
        s.channels();
        s.volumecontrol();
        s.settings();
    }
}