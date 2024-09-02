package kkk.practice;

import java.util.Arrays;

public class sort0s1s {
    public static void main(String[] args) {
        int[] ar={1,0,0,1,0,0,1,0};
        int zeroes=0;
//        for(int i=0;i<ar.length;i++)
//        {
//            if(ar[i]==0)
//            {
//                zeroes++;
//            }
//        }
//        for(int i=0;i<ar.length;i++)
//        {
//            if(i<zeroes)
//            {
//                ar[i]=0;
//            }
//            else {
//                ar[i]=1;
//            }
//        }
//        System.out.println(Arrays.toString(ar));


        System.out.println(Arrays.toString(ans(ar)));
    }
    static int[] ans(int[] ar)
    {
        int s=0;
        int e=ar.length-1;
        while(s<e)
        {
            if(ar[s]==1 && ar[e]==0)
            {
                swap(ar,s,e);
                s++;
                e--;
            }
            if(ar[s]==0)
            {
                s++;
            }
            if(ar[e]==1)
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
