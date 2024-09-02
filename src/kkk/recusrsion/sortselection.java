package kkk.recusrsion;

import java.util.Arrays;

public class sortselection {
    public static void main(String[] args) {
        int[] ar={0,1,1,0,1,0,2,1,2,0,1};
//        printsort(ar,ar.length-1,0);
//        System.out.println(Arrays.toString(ar));
        selectionsrot(ar,ar.length,0,0);
        System.out.println(Arrays.toString(ar));
    }
    static void printsort(int[] ar,int r,int c)
    {
        if(r==0)
        {
            return;
        }
        if(c<r)
        {

//            int max=c;
           int max1= findmax(ar,r,c,c);
            if(ar[r]<ar[max1])
            {
                int temp=ar[r];
                ar[r]=ar[max1];
                ar[max1]=temp;
            }
            printsort(ar,r,c+1);

        }
        else {
            printsort(ar,r-1,0);
        }
    }
    static int findmax(int[] ar, int r,int  start,int max)
    {
//        int max=start;
        if(start==r)
        {
            return max;
        }
        if(ar[start]>ar[max])
        {
            max=start;
        }
        return findmax(ar,r,start+1,max);
    }

//
//    another method for sorting via selection sort
    static void selectionsrot(int[] ar,int r,int c,int max)
    {
        if(r==0)
        {
            return;
        }
        if(c<r)
        {
            if(ar[c]>ar[max])
            {
                selectionsrot(ar,r,c+1,c);
            }
            else{
                selectionsrot(ar,r,c+1,max);
            }
        }
        else {
            int temp=ar[r-1];
            ar[r-1]=ar[max];
            ar[max]=temp;
            selectionsrot(ar,r-1,0,0);
        }
    }


}
