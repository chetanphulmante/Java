package kkk.practice.Accneture;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class q5 {
    public static void main(String[] args) {
        String str="1C0C1C1A0B1";
        System.out.println(ans1(str));
    }
    static int  ans1(String str)
    {
        int ans=str.charAt(0)-'0';
        char c1='A';
        char c2='B';
        char c3='C';
        for(int i=1;i<str.length()-1;i=i+2)
        {
            if(str.charAt(i)==c1)
            {
                ans=(ans&(str.charAt(i+1)-'0'));
            } else if (str.charAt(i)=='B') {
                {
                    ans=(ans | (str.charAt(i+1)-'0'));
                }

            }
            else {
                ans=(ans ^ (str.charAt(i+1)-'0'));
            }

        }
        return ans;
    }
}
