 package kkk.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class codechef {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0)
        {
            t--;
            int n = in.nextInt();
            int x=in.nextInt();
            int[] ar = new int[n];
            for(int i=0;i<ar.length;i++)
            {
                ar[i]=in.nextInt();
            }
            System.out.println(ans(n,x,ar));
            // System.out.println(n);

        }
//        System.out.println(ans(t));
    }
    static int ans(int n,int x,int[] ar)

    {
        int count=0;
        int sum=0;
        List<Integer> arr=new ArrayList<>();

        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>=x)
            {
                count++;
                sum=sum+ar[i]-x;
//                ar[i]=x;

            }
            else{
                arr.add(i);
            }
            //    System.out.print(num);

        }
        arr.sort(Collections.reverseOrder());

        for(int i:arr)
        {
            if(sum>=x-i)
            {
                sum-=(x-ar[i]);
//                ar[i]=x;
                count++;
            }
            else{
                return count;
            }
//            System.out.print(ar[i]);
        }
//        for(int num:ar){
//            if(num>=x)
//            {
//                count++;
//            }
//        }
        return count;
    }



}
