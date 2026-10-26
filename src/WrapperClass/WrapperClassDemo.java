package WrapperClass;

public class WrapperClassDemo {

    public static void main(String[] args) {
        int i = 5;

        System.out.println("i="+i);
        
        Integer ii = i;

        System.out.println("ii="+ii);

        int a1 = ii.intValue(); // unboxing / unwrapping
        int a2 = ii ; //  auto unboxing /  auto unwrapping

        System.out.println("a1="+a1);
        System.out.println("a2="+a2);

    }
}
