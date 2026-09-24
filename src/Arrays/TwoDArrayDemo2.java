package Arrays;

public class TwoDArrayDemo2 {

    public static void main(String[] args) {

        int[][] a = {
                {11,22,33},
                {10,20,30},
                {21,31,41},
                {99,88,66}
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
