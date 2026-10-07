package Inheritance.Hierarchical;

public class HierarchicalInheritanceDemo {

    public static void main(String[] args) {

        System.out.println("--- Bird object ---");
        Bird b = new Bird();
        b.fly();

        System.out.println("\n--- Sparrow object ---");
        Sparrow s = new Sparrow();
        s.sparrowColor();
        s.fly();            // inherited from Bird

        System.out.println("\n--- Crow object ---");
        Crow c = new Crow();
        c.crowColor();
        c.fly();            // inherited from Bird
    }
}
