package Inheritance.Multilevel;

public class MultilevelInheritanceDemo {

    public static void main(String[] args) {

        System.out.println("--- Animal object ---");
        Animal a = new Animal();
        a.eat();

        System.out.println("\n--- Dog object ---");
        Dog d = new Dog();
        d.bark();
        d.eat();        // inherited from Animal

        System.out.println("\n--- BabyDog object ---");
        BabyDog bd = new BabyDog();
        bd.weep();
        bd.bark();      // inherited from Dog
        bd.eat();       // inherited from Animal (through Dog)
    }
}
