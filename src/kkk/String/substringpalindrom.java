package kkk.String;

import java.util.Scanner;

public class substringpalindrom {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(total(s));


    }
    static int total(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length()+1;j++)
            {

                if(palindrome(s.substring(i,j)))
                {
                    count++;
                }
            }
        }
        return count;
    }
    static boolean palindrome(String s)
    {
//        boolean flag=true;
        int start=0;
        int end=s.length()-1;
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
