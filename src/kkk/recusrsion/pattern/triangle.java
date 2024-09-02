package kkk.recusrsion.pattern;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
//        int c= sc.nextInt();
        int c=0;
        print2(r,c);
    }
    static void print(int r,int c)
    {
        if(r==0)
        {
            return;
        }
        if(c<r)
        {
            System.out.print("* ");
            print(r,c+1);
        }
        else {
            System.out.println();
            print(r-1,0);
        }
    }
    static void print2(int r,int c)
    {
        if(r==0)
        {
            return;
        }
        if(c<r)
        {

            print2(r,c+1);
            System.out.print("* ");
        }
        else {

            print2(r-1,0);
            System.out.println();
        }
    }
}
