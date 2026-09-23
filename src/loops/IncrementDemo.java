package loops;

public class IncrementDemo {
/*
* a++ / a- - : first statement will execute
* and the increment or decrement happens

++a / - - a :   first increment or decrement happens
*  then the statement will execute

* */
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i); // 10
        System.out.println(i++); // 10
        System.out.println(i); // 11
        System.out.println(++i); // 12
        System.out.println(i); // 12
    }
}
