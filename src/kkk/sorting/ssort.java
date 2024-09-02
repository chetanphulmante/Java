package kkk.sorting;

import java.util.Arrays;

public class ssort {
    public static void main(String[] args) {
        int[] arr={12,1,3,53,4};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
//    pick one element and put it
    static void selection(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            //find the max item in the reamaining array and swap it with correct index
            int last=arr.length-i-1;
            int maxindex=getmaxindex(arr,0,last);
            swap(arr,maxindex,last);
        }
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    static int getmaxindex(int[] arr, int start, int end) {
        int max=start;
        for(int i=start;i<=end;i++)
        {
            if(arr[max]<arr[i]){
                max=i;
            }

        }
        return max;
    }
}
