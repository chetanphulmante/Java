package kkk.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class sapq1 {
    public static void main(String[] args)
    {
        int[] ar={-11,-2,19,37,64,-18};
        int n=ar.length;
        int k=3; //windowlength
        int[] arr=new int[n-k+1];
        for(int i=0;i<ar.length-k+1;i++)
        {
//
//            int min=0;
//            boolean flag=true;
            for(int j=i;j<i+k;j++)
            {
                if(ar[j]<0)
                {
//                    min=ar[j];
//                    flag =false;
                    arr[i]=ar[j];
                    break;
                }
            }
//            if(!flag)
//            {
//                arr[i]=min;
//            }
//            else {
//                arr[i]=min;
//            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
