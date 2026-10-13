package FinalNStatic;

public class Student2 {
    public int rno;
    public String name;
    public static String college = "ITC";

    public void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static void staticMethod1()
    {
        System.out.println("staticMethod1");

     //   System.out.println("rno="+rno);  // non-static - non-allowed
      //  System.out.println("name="+name); // non-static - non-allowed
        System.out.println("college="+college); // static - allowed
        staticMethod2(); // static - allowed
        //nonStaticMethod(); // non-static - non-allowed
       // display(); // non-static - non-allowed

    }

    public static void staticMethod2()
    {
        System.out.println("staticMethod2");
    }

    public void nonStaticMethod()
    {
        System.out.println("nonStaticMethod");
    }

    public static void main(String[] args) {

        Student2.staticMethod1();
        Student2.staticMethod2();
    }
}
