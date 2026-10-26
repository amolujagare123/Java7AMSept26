package collectionsDemo.arrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("pooja");
        al.add("surekha");
        al.add("nadeem");
        al.add("Java");
        al.add("selenium");

        System.out.println(al);

        System.out.println("Using for loop ....");
        for (int i =0 ; i<al.size() ; i++)
        {
            System.out.println(al.get(i));
        }

        System.out.println("Using for each loop ....");

        for (String str : al)
        {
            System.out.println(str);
        }

        System.out.println("Using Iterator ....");

        Iterator itr = al.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());





    }
}
