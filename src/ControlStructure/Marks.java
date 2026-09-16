package ControlStructure;

public class Marks {

    public static void main(String[] args) {

        int marks = 98;

        if(marks<35)
            System.out.println("Fail");

        else if(marks>=35 && marks<50)
            System.out.println("pass");

        else if(marks>=50 && marks<60)
            System.out.println("second class");

        else if(marks>=60 && marks<85)
            System.out.println("first class");

        else if(marks>=85)
            System.out.println("Distinction");

    }
}
