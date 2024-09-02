package kkk.practice;

import java.util.Scanner;

public class wisdomq1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k= sc.nextInt();
        sc.nextLine();
//        String str1=sc.nextLine();
//        System.out.println(sk(str1));
//        String[] str2=str1.split("\n");
//        sk(str2);
        String[] ar=new String[k];
        for(int i=0;i<k;i++)
        {
            ar[i]=sc.nextLine();
        }
        sk(ar);

    }
    static void sk(String[] str2)
    {
        int[] count=new int[str2.length];
        for(int i=0;i<str2.length;i++)
        {
//            int max=0;
            for(int j=i;j< str2.length;j++)
            {
//                int k=0;
                if(str2[i].equals(str2[j]))
                {
                    count[i]++;
                }
            }
//            count[i]=max;
        }
        for(int i=0;i< str2.length-1;i++)
        {
            if(count[i]>1)
            {
                System.out.print(str2[i]+",");
                count[i] = 0;
            }
        }
        if(count[str2.length-1]>1)
        {
            System.out.println(str2[str2.length-1]);
        }
    }
}
