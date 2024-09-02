package kkk.practice;

import java.util.Arrays;

public class cyclicsort {
    // when given range then use cyclic sort
    public static void main(String[] args) {
        int[] arr={5,2,3,1,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr)
    {
       int i=0;
       while(i<arr.length)
       {
           int correctindex=arr[i]-1;
           if(arr[i]!=arr[correctindex])
           {
               int temp=arr[i];
               arr[i]=arr[correctindex];
               arr[correctindex]=temp;
           }
           else{
               i++;
           }
       }
    }
}
