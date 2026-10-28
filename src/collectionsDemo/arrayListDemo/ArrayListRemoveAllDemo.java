package collectionsDemo.arrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveAllDemo {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("pooja");
        al.add("surekha");
        al.add("nadeem");
        al.add("Java");
        al.add("selenium");

        System.out.println("al="+al);

        ArrayList<String> al2 = new ArrayList<>();

        al2.add("text 1");
        al2.add("text 2");
        al2.add("text 3");
        al2.add("text 4");
        al2.add("text 5");
        al2.add("surekha");
        al2.add("nadeem");
        al2.add("Java");


        System.out.println("al2="+al2);

        al2.removeAll(al);

        System.out.println("al2="+al2);








    }
}
