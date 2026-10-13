package Methods;

public class MethodDemo {

    void printMyArray(int[] arr)
    {
        System.out.println("this is the array");

        for (int i=0;i<arr.length ; i++)
            System.out.println(arr[i]);
    }

    // write below method
    void printMy2DArray(String[][] stArr)
    {
        System.out.println("this is the array");


    }




    public static void main(String[] args) {

        MethodDemo ob = new MethodDemo();

        int[] a = {12,34,67,9,0,11};

        ob.printMyArray(a);
    }
}
