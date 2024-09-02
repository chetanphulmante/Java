package kkk.practice;

import java.util.Arrays;

public class prefixsum {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(prefixsumans(ar)));
    }
    static int[] prefixsumans(int[] ar)
    {

        for(int i=1;i<ar.length;i++)
        {
            ar[i]+=ar[i-1];
        }
        return ar;
    }


}
