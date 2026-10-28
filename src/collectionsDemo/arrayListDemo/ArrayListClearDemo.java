package collectionsDemo.arrayListDemo;

import java.util.ArrayList;

public class ArrayListClearDemo {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        System.out.println(al.isEmpty()); // true

        al.add("amol");
        al.add("pooja");
        al.add("surekha");
        al.add("nadeem");
        al.add("Java");
        al.add("selenium");
        System.out.println(al.isEmpty()); // false

        System.out.println("al="+al);

        al.clear();
        System.out.println(al.isEmpty()); // true

        System.out.println("al="+al);








    }
}
