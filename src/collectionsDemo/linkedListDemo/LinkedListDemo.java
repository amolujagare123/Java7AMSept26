package collectionsDemo.linkedListDemo;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("amol");
        ll.add("pooja");
        ll.add("surekha");
        ll.add("nadeem");
        ll.add("Java");
        ll.add("selenium");

        System.out.println(ll);

        ll.add(2, "XYZ");
        System.out.println(ll);

        ll.addFirst("First");
        ll.addLast("Last");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
