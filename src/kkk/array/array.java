package kkk.array;
import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
//         datatype[] variable_name- new datatype[size];
//        Arrays of primtive
        int[] arr=new int [4];
        System.out.println(arr[1]);
        String[] ar=new String[3];
        System.out.println(ar[1]);

        Scanner in=new Scanner(System.in );
        int[] ar1=new int[4];
//        for(int i=0;i<ar1.length;i++)
//        {
//            ar1[i]=in.nextInt();
//        }
//        for(int i=0;i<ar1.length;i++)
//        {
//            System.out.print(ar1[i]+ " ");
//        }
//        ## enhaned for loop for(datatype variablename : arrayname)
//        for (int j : ar1) {
//            System.out.print(j + " "); // here j represent the elemnt of array
//        }
//        System.out.println(Arrays.toString(ar1));

//        arrays of objects
        String[] str = new String[4];

        for(int i=0;i<str.length;i++)
        {
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));
    }


}
