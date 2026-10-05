package ClassesNConstructors;

public class MyClass {
    int a;
    double d;
    char c;
    String str; // data members

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {



        MyClass ob = new MyClass();
        ob.a = 10;
        ob.d = 34.66;
        ob.c = 'h';
        ob.str = "amol";
        ob.display();

        MyClass ob2 = new MyClass();
        ob2.a = 101;
        ob2.d = 341.66;
        ob2.c = 'c';
        ob2.str = "text";
        ob2.display();
    }


}
