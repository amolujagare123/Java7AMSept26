package Arrays;

public class ArrayDemo2 {

    public static void main(String[] args) {

        int[] a = {12,45,68,32,222,111,67};


        System.out.println("length="+a.length);

        System.out.println("============ for loop ============");
        for (int i=0 ; i<a.length ;i++)
             System.out.println(a[i]);

        System.out.println("============ for each loop ============");
        
        for(int x : a)
        {
            System.out.println(x);
        }
    }
}
