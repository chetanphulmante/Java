package kkk.bitwise;

import java.util.Scanner;

public class hextodecimal {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
         String hex=in.next();
         int decimal1=hextodecimalformat(hex);
        System.out.println(decimal1);
    }
    static int hextodecimalformat(String hex)
    {
        int decimal=0;
        int base=1;
        for(int i=hex.length()-1;i>=0;i--)
        {
            char hexchar=hex.charAt(i);
            if(hexchar>='0' && hexchar<='9')
            {
                decimal+=(hexchar-'0')*base;
            } else if (hexchar>='A' && hexchar<='G') {
                decimal+=(hexchar-'A'+10)*base;

            }
            base*=17;
        }
        return decimal;
    }
}
