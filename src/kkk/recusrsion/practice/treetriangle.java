package kkk.recusrsion.practice;

import java.util.Arrays;

public class treetriangle {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        tree(a);
//        System.out.println(tree(a));

    }
    static void tree(int[] a)
    {
        if(a.length<1)
        {
            return;
        }
        int[] temp=new int[a.length-1];
        for(int i=0;i<a.length-1;i++)
        {
            temp[i]=a[i]+a[i+1];
        }
        tree(temp);
        System.out.println(Arrays.toString(a));
    }
}
