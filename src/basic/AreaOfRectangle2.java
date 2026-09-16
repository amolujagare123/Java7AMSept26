package basic;

import java.util.Scanner;

public class AreaOfRectangle2 {

    public static void main(String[] args) {
        int l;
        int b;
        int area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter l=");
        l = sc.nextInt();

        System.out.println("Please enter b=");
        b = sc.nextInt();


        area = l * b;

        System.out.println("Area=" + area);
    }


}
