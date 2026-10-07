package ClassesNConstructors.pack1;

public class Java2 extends Java1{

    public static void main(String[] args) {
        Java1 ob = new Java1();
        ob.a = 10;
   //     ob.d = 34.66;
        ob.c = 'h';
        ob.str = "amol";
        ob.display();


        Java2 j2 = new Java2();

        j2.a = 10; // public
        //     j2.d = 34.66; // private
        j2.c = 'h'; // protected
        j2.str = "amol"; // default

    }


}
