package kkk.recusrsion;

import java.util.ArrayList;
import java.util.Arrays;

public class linearsearch {
    public static void main(String[] args) {
        int[] ar={1,4,2,44,9,4,88,3,45};
        int target=4;
//        System.out.println(ls(ar,target,0));
//        ls(ar,target,0);
//        System.out.println(list);
        System.out.println(ls(ar,target,0,new ArrayList<>()));
    }
//    static ArrayList<Integer> list=new ArrayList<>();
    static ArrayList<Integer> ls(int[] ar,int target,int i,ArrayList<Integer> list)
    {

        if(i==ar.length)
        {
            return list;
        }
        if(ar[i]==target){
            list.add(i);

        }
        return ls(ar,target,i+1,list);

    }
    static ArrayList<Integer> ls2(int[] ar,int target,int i)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(i==ar.length)
        {
            return list;
        }
        if(ar[i]==target){
            list.add(i);

        }
        ArrayList<Integer> ansfrombelow=ls2(ar,target,i+1);
        list.addAll(ansfrombelow);
        return list;
    }

}
