package Arrays;

public class TwoDArrayDemo3 {

    public static void main(String[] args) {

        char[][] a =
                {

                        {'a','b','c'},
                        {'d','e','f'},
                        {'g','h','i'}
                };




        int row = a.length;
        int col = a[0].length;

        System.out.println("row="+row);
        System.out.println("col="+col);

        for(int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }




    }
}
