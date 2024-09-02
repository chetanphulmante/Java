package kkk.array;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(10);


        list.add(67);
        list.add(34);
        list.add(34);
        list.add(345);

//        ## multiple arraylist
        Scanner in=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list1=new ArrayList<>();
        for (int i=0;i<3;i++)
        {
            list1.add(new ArrayList<>());
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                list1.get(i).add(in.nextInt());
            }
        }

        System.out.println(list1);
    }
}