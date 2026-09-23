package loops;

public class DecrementDemo {
/*
* a++ / a- - : first statement will execute
* and the increment or decrement happens

++a / - - a :   first increment or decrement happens
*  then the statement will execute

* */
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i); // 10
        System.out.println(i--); // 10
        System.out.println(i); // 9
        System.out.println(--i); // 8
        System.out.println(i); // 8
    }
}
