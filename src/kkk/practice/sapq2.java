package kkk.practice;

import java.util.Arrays;

public class sapq2 {
    public static void main(String[] args) {
        String s1="abcdf";
        String s2="dbca";
        char[] c1=s1.toCharArray();
        Arrays.sort(c1);
        char[] c2=s2.toCharArray();
        Arrays.sort(c2);
        boolean flag=true;
        for(int i=0;i<s2.length();i++)
        {
            if(c1[i]!=c2[i])
            {
                flag=false;
                System.out.println(c1[i]);
                break;
            }
        }
        if(flag)
        {
            System.out.println(c1[s1.length()-1]);
        }
    }
}
