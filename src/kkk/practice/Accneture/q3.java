package kkk.practice.Accneture;

import java.util.concurrent.atomic.AtomicInteger;

public class q3 {
    public static void main(String[] args) {
        String str="acbbbabbbc";
        AtomicInteger max=new AtomicInteger(0);
        count1(str,max);
        System.out.println(max);

    }
    static void count1(String str, AtomicInteger max)
    {
//        int n=str.length();
        if(str.length()==0|| str.length()==1) max.set(str.length());
//          return;
        for(int i=0;i<str.length()-1;i++)
        {
            int j=i;
            int k=i;
            while(j>=0 && k<str.length())
            {
//                char ch1=str
                if(str.charAt(k)==(str.charAt(j)))
                {
                    if(max.get()<(k-j+1))max.set(k-j+1);

                    j--;
                    k++;
                }
                else{

                    break;
                }
            }


        }
        for(int i=0;i<str.length()-2;i++)
        {
            int j=i;
            int k=i+1;
            {
                while(j>=0 && k<str.length())
                {
                    if(str.charAt(j)!=str.charAt(k))
                    {
                       break;
                    }
                    if(max.get()<(k-j+1))max.set(k-j+1);
                    j--;
                    k++;

                }
            }
        }
    }
}
