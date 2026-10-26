package WrapperClass;

public class Conversions {

    public static void main(String[] args) {

        String s1 = "22";
        String s2 = "44";

        System.out.println(s1 + s2);

        int a1 = Integer.parseInt(s1);
        int a2 = Integer.parseInt(s2);

        System.out.println(a1 + a2);

        String s3 = "22.34";
        String s4 = "44.56";

        float f1 = Float.parseFloat(s3);
        float f2 = Float.parseFloat(s4);

        System.out.println(f1 + f2);

        double d1 = Double.parseDouble(s3);
        double d2 = Double.parseDouble(s4);

        System.out.println(d1 + d2);

        String s5 = "false";

        boolean result = Boolean.parseBoolean(s5);

        if(result)
            System.out.println("this is true");
        else
            System.out.println("this is false");


        String s6 = "s";

        char ch = s6.charAt(0);

        System.out.println("ch="+ch);
    }
}
