package collectionsDemo.arrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAddAllDemo {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("pooja");
        al.add("surekha");
        al.add("nadeem");
        al.add("Java");
        al.add("selenium");

        System.out.println(al);

        ArrayList<String> al2 = new ArrayList<>();
        System.out.println(al2);

        al2.addAll(al);

        System.out.println(al2);






    }
}
