package StringsDemo;

public class SplitDemo3 {

    public static void main(String[] args) {

        String str = "Smoking is a bad Habit";
        String[] stArr = str.split(" ");

        for (int i=0 ; i< stArr.length ; i++) {

            if(stArr[i].equals("bad"))
            System.out.print(stArr[i].toUpperCase()+" ");
            else
                System.out.print(stArr[i]+" ");

        }
    }
}
