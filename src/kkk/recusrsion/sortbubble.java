package kkk.recusrsion;

import java.util.Arrays;

public class sortbubble {
    public static void main(String[] args) {
        int[] ar={0,1,1,0,1,0,2,1,2,0,1};
        int r=ar.length-1;
        printsort(ar,r,0);
        System.out.println(Arrays.toString(ar));

    }
    static void printsort(int[] ar, int r, int c)
    {
        if(r==0)
        {
            return ;
        }
        if(c<r)
        {
            if (ar[c] > ar[c+1]) {
                swap(ar,c,c+1);
            }

            printsort(ar,r,c+1);
        }
        else
        {
            printsort(ar,r-1,0);
        }
//        return ar;
    }
    static void swap(int[] ar,int r,int c)
    {
        int temp=ar[c];
         ar[c]=ar[r];
        ar[r]=temp;
    }
}
