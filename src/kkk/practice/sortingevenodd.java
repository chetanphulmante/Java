package kkk.practice;

import java.util.Arrays;

public class sortingevenodd {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,6,7,8,9,0};
        System.out.println(Arrays.toString(ans(ar)));

    }
    static int[] ans(int[] ar)
    {
        int s=0;
        int e=ar.length-1;
        while(s<e)
        {
            if(ar[s]%2==1 && ar[e]%2==0)
            {
                swap(ar,s,e);
                s++;
                e--;
            }
            if(ar[s]%2==0)
            {
                s++;
            }
            if(ar[e]%2==1)
            {
                e--;
            }
        }
        return ar;

    }
    static void swap(int[] ar,int s,int e)
    {
        int temp=ar[s];
        ar[s]=ar[e];
        ar[e]=temp;

    }

}
