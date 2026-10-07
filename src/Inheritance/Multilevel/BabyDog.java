package Inheritance.Multilevel;

public class BabyDog extends Dog {  // gets 1 copy of bark() from Dog + eat() via Dog

    public void weep() {
        System.out.println("BabyDog is weeping");
    }
}
