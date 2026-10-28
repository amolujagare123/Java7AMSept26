package collectionsDemo.arrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSetDemo {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("pooja");
        al.add("surekha");
        al.add("nadeem");
        al.add("Java");
        al.add("selenium");

        System.out.println(al);

        al.set(3,"updated value");

        System.out.println(al);


    }
}
