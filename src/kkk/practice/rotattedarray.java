package kkk.practice;

import java.util.Arrays;

public class rotattedarray {
    public static void main(String[] args) {
//        rotate array by k steps
        int[] ar={1,2,3,4,5,7,6,8};
        int n=ar.length;
        int k=3;
        k=k%n;
        int[] ans=new int[ar.length];
        int j=0;
        for(int i=n-k;i<n;i++)
        {
//            ans[j++]=ar[i];
            System.out.print(ar[i]);
        }
        for(int i=0;i<n-k;i++)
        {
//            ans[j++]=ar[i];
            System.out.print(ar[i]);
        }
//        System.out.println(Arrays.toString(ans));
    }
}
