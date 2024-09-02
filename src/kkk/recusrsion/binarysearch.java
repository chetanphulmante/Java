package kkk.recusrsion;

import java.util.Scanner;

public class binarysearch {
    public static  void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int target=in.nextInt();
        int[] ar={1,2,4,7,11,14,16,17};
        System.out.println(bs(ar,target,0,ar.length-1));
    }
//    static int fibo(int n){
//        if(n<2)
//        {
//            return n;
//        }
//        return fibo(n-1)+fibo(n-2);
//    }
    static int bs(int[] ar,int target,int s,int e)
    {
        if(s>e)
        {
            return -1;
        }
        int m=s+(e-s)/2;
        if(target==ar[m])
        {
            return m;
        }
        else if(target<ar[m])
        {
            e=m-1;
            return bs(ar,target,s,e);
        }
        else {
            s=m+1;
            return bs(ar,target,s,e);
        }
    }
}
