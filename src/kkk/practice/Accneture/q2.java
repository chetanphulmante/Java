package kkk.practice.Accneture;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class q2 {
    public static void main(String[] args) {
        int[] ar={3,2,6,18,54};
        int taregt=3;
        ArrayList<Integer> temp=new ArrayList<>();
//        int maxi=0;
        AtomicInteger maxi=new AtomicInteger(0);
        count(ar,taregt,0,temp,maxi);
        System.out.println(maxi.get());
    }
//    static int inversionpair(int[] ar,int k)
//    {
//        ArrayList<Integer> temp= new ArrayList<>();
//        for(int i=0;i<ar.length;i++)
//        {
//
//        }
//        return count(0,temp);
//
//
//    }
    static void count(int[] ar,int k,int i,ArrayList<Integer> temp,AtomicInteger maxi)
    {
        if(i==ar.length)
        {
            if(maxi.get()< temp.size()) maxi.set(temp.size()) ;
            return;
        }
        if(temp.size()==0||temp.get(temp.size()-1)*3==ar[i])
        {
            temp.add(ar[i]);
            count(ar,k,i+1,temp,maxi);
            temp.remove(temp.size()-1);
        }
//        else if(Math.abs(temp.get(temp.size()-1)-ar[i])%k==0)
//        {
//            temp.add(ar[i]);
//            count(ar,k,i+1,temp,maxi);
//            temp.remove(temp.size()-1);
//        }
        count(ar,k,i+1,temp,maxi);
    }
}
