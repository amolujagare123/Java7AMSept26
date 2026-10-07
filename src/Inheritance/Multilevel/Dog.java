package Inheritance.Multilevel;

public class Dog extends Animal {   // gets 1 copy of eat() from Animal

    public void bark() {
        System.out.println("Dog is barking");
    }
}
