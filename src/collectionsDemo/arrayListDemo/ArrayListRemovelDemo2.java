package collectionsDemo.arrayListDemo;

import java.util.ArrayList;

public class ArrayListRemovelDemo2 {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(11);
        al.add(16);
        al.add(31);
        al.add(14);
        al.add(51);

        System.out.println(al);

        Integer ii = 31;

        al.remove(ii);

        System.out.println(al);






    }
}
