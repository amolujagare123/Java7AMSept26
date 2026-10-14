package Methods;

public class MethodReturning {

    int myMethod()
    {
        int a = 10;
        System.out.println("inside myMethod");
        return a;
    }

    int[] getMyArray(int a)
    {
        // create the table of value a & store it into array & return it
       int[] arr = new int[10];
       for (int i=0 ; i<10 ;i++)
           arr[i] = i * a;


       return arr;
    }

    String reverseString(String str)
    {
        String temp = "";
        for (int i=str.length()-1 ;i>=0 ; i--)
            temp = temp + str.charAt(i);

       // System.out.println(temp);
        return temp;
    }

    String[][] getReverseStringArray(String[][] stArr)
    {
        String[][] revStringArr = new String[stArr.length][stArr[0].length];

        for (int i=0;i< stArr.length ; i++)
            for (int j=0;j<stArr[0].length ; j++)
                revStringArr[i][j] = reverseString(stArr[i][j]);

        return revStringArr;

    }

    public static void main(String[] args) {
        MethodReturning ob = new MethodReturning();


        int x;
        x = 10 ;
        int y = x;
        System.out.println(x);

        int myValue = ob.myMethod();

        System.out.println(myValue);
        System.out.println(ob.myMethod());

        int[] myTable = ob.getMyArray(5);
        for (int a : myTable)
            System.out.println(a);

        System.out.println(ob.reverseString("amol ujagare"));



        String[][] names = {
                {"Aarav",  "Priya",  "Rohan"},
                {"Ananya", "Vikram", "Sneha"},
                {"Arjun",  "Kavya",  "Siddharth"}
        };

        String[][] revNames = ob.getReverseStringArray(names);

        for (int i=0;i< revNames.length ; i++) {
            for (int j = 0; j < revNames[0].length; j++) {
                System.out.print(revNames[i][j] + "\t");
            }
            System.out.println();
        };
    }
}
