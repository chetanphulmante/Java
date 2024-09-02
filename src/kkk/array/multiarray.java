package kkk.array;
import java.util.Scanner;
import java.util.Arrays;

public class multiarray {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        int[][] ar=new int[3][2];
        for(int row=0;row<ar.length;row++)
        {
            for(int col=0;col<ar[row].length;col++)
            {
                ar[row][col]=in.nextInt();
            }
//            System.out.println();
        }
//        for(int row=0;row<ar.length;row++)
//        {
//            for(int col=0;col<ar[row].length;col++)
//            {
//                System.out.print(ar[row][col]+ " ");
//            }
//            System.out.println();
//        }
        for(int row=0;row<ar.length;row++)
        {
            System.out.println(Arrays.toString(ar[row]));
        }
//        ## enhaned for loop
        for(int[] a:ar)
        {
            System.out.println(Arrays.toString(a));
        }

////        #for multi array enhanced for loop like
//        for(int[] ints:accounts){
//            for(int anint :ints)
        }

    }

