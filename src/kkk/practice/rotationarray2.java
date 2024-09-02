package kkk.practice;

import java.util.Arrays;
import java.util.Scanner;

public class rotationarray2 {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,6,7,8};
        int k=3;
        int n=ar.length;
        k=k%n;
        reverse(ar,0,n-k-1);
        reverse(ar,n-k,n-1);
        reverse(ar,0,n-1);
        System.out.println(Arrays.toString(ar));

    }
    static int[] reverse(int[] ar, int i, int j)
    {
//        int i=0;
//        int j=ar.length-1;
        while(j>i)
        {
            int swap=ar[i];
            ar[i]=ar[j];
            ar[j]=swap;
            i++;
            j--;
        }
        return ar;
    }
}
