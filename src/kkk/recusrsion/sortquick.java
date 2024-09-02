package kkk.recusrsion;

import java.util.Arrays;

public class sortquick {
    public static void main(String[] args) {
        int[] ar={1,3,2,7,9,8,3};
        quicksort1(ar,0,ar.length-1);
        System.out.println(Arrays.toString(ar));
    }
    static void quicksort1(int[] ar,int low,int hi)

    {
        if(low>=hi)
        {
            return;
        }
        int s=low;
        int e=hi;
        int m=s+(e-s)/2;
        int pivot=ar[m];
        while(s<=e)
        {
            while(ar[s]<pivot)
            {
                s++;
            }
            while(ar[e]>pivot)
            {
                e--;
            }
            if(s<=e)
            {
                int temp=ar[s];
                ar[s]=ar[e];
                ar[e]=temp;
                s++;
                e--;
            }
            quicksort1(ar,low,e);
            quicksort1(ar,s,hi);
        }

    }
}
