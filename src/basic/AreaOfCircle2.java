package basic;

import java.util.Scanner;

public class AreaOfCircle2 {

    public static void main(String[] args) {

        double r ;
        double pi = 3.14;
        double area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter r =");
        r = sc.nextDouble();

        area = pi * r * r;

        System.out.println("area=" + area);

    }
}
