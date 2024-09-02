package kkk.practice;

import java.util.Scanner;

public class eg {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        String[] k=s.split(",");
        int count=0;
        for(int i=0;i<k.length-1;i++)
        {
            for(int j=i+1;j<k.length;j++)
            {
                int num1 = Integer.parseInt(k[i]);
                int num2 = Integer.parseInt(k[j]);
                if((num1+num2)%60==0)
                {
                    count++;
                }
            }
        }


    }

}
