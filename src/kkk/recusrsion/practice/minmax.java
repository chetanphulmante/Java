package kkk.recusrsion.practice;

//import static java.lang.Math.min;

public class minmax {
    public static void main(String[] args) {
        int[] arr={1,234,2,3,2,3,-234,-323};
        int n=arr.length;
        System.out.println(mina(arr,n));
    }
    static int mina(int[] a,int n)
    {
        if(n==1)
        {
            return a[0];
        }
        return Math.min(a[n-1],mina(a,n-1));
    }
}
