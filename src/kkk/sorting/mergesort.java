package kkk.sorting;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] ar={3,4,1,6,2,8};
        System.out.println(Arrays.toString(mergesort1(ar)));
    }
    static int[] mergesort1(int[] ar)
    {
        if(ar.length==1)
        {
            return ar;
        }
        int mid=ar.length/2;
        int[] left=mergesort1(Arrays.copyOfRange(ar,0,mid));
        int[] right=mergesort1(Arrays.copyOfRange(ar,mid,ar.length));

        return merge(left,right);
    }
    static int[] merge(int[] first,int[] second)
    {
        int[] mix=new int[(first.length+second.length)];
        int i=0;
        int j=0;
        int k=0;
        while(i< first.length && j< second.length)
        {
            if(first[i]<second[j]){ mix[k++]=first[i]; i++;}
            else {mix[k++]=second[j]; j++;}

        }
        while(i< first.length)
        {
            mix[k++]=first[i];
            i++;
        }
        while(j< second.length)
        {
            mix[k++]=second[j];
            j++;
        }
        return mix;

    }
}
