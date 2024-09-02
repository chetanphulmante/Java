package kkk.sorting;

import java.util.Arrays;

public class bsort {
    //    comparing every adjacent elment
    //    it also known as sinking sort or excahnge sort
    public static void main(String[] args) {
        int[] arr={1,2,8,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr)
    {
        boolean swapped;
        for(int i=0;i<arr.length;i++)
        {
            swapped=false;
            for(int j=1;j<arr.length-i;j++)
            {
                // swap item if it is bigger than next adjacent
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                swapped =true;
            }
            if(!swapped){
                break;
            }
        }
    }

}
