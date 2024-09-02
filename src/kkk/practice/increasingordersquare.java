package kkk.practice;

import java.util.Arrays;

public class increasingordersquare {
    public static void main(String[] args) {
        int[] ar={-10,-6,-3,0,2,4,8};
        System.out.println(Arrays.toString(ans(ar)));
    }
    static int[] ans(int[] ar)
    {
        int s=0;
        int e=ar.length-1;
        int[] ans1=new int[ar.length];
        int k=0;
        while(s<e){

            if(ar[s]*ar[s]<ar[e]*ar[e])
            {
                ans1[k++]=ar[e]*ar[e];
                ;
//                s++;
                e--;
            }
            else if(ar[s]*ar[s]>ar[e]*ar[e])
            {
                ans1[k++]=ar[s]*ar[s];
//                k++;
                s++;
//                e--;
            }
            else if(ar[s]*ar[s]==ar[e]*ar[e])
            {
                ans1[k++]=ar[e]*ar[e];
                ans1[k++]=ar[e]*ar[e];
//                k++;
                s++;
                e--;
            }
        }
        return reverse(ans1,0,ar.length-1);
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
