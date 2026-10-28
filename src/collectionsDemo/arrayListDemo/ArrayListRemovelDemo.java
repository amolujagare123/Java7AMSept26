package collectionsDemo.arrayListDemo;

import java.util.ArrayList;

public class ArrayListRemovelDemo {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("pooja");
        al.add("surekha");
        al.add("nadeem");
        al.add("Java");
        al.add("selenium");

        System.out.println(al);

        al.remove("Java");

        System.out.println(al);






    }
}
