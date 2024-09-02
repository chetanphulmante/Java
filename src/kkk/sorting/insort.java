package kkk.sorting;

import java.util.Arrays;

public class  insort {
    // it sorting partially by partially
    // insertion sort is adaptive,numbers of steps reduced compare to bubble sort
    // it is stable
    //used for smaller valus of n,works good array if partially sorted,it takes part in hybrid sort
    public static void main(String[] args) {
        int[] arr={2,5,1,63,4};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void insertion(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

