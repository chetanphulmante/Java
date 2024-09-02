package kkk;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] ar={1, 2 ,3,4,5 ,8};
        reverse(ar);
        System.out.println(Arrays.toString(ar));
    }
//   ## reverse array
    static void reverse(int[] ar) {
        int start = 0;
        int end = ar.length - 1;
        while (start < end) {
            swap1(ar, start, end);
            start++;
            end--;
        }
    }
        static void swap1(int[] ar, int a,int b){
           int temp=ar[a];
           ar[a]=ar[b];
           ar[b]=temp;


        }
    }


