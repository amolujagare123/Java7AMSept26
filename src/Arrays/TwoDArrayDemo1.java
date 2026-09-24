package Arrays;

public class TwoDArrayDemo1 {

    public static void main(String[] args) {

        int[][] a = new int [4][3];

        a[0][0] = 10;
        a[0][1] = 20;
        a[0][2] = 30;

        a[1][0] = 11;
        a[1][1] = 21;
        a[1][2] = 31;

        a[2][0] = 31;
        a[2][1] = 32;
        a[2][2] = 33;

        a[3][0] = 41;
        a[3][1] = 42;
        a[3][2] = 43;

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
