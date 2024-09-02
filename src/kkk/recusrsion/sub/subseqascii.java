package kkk.recusrsion.sub;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class subseqascii {
    public static void main(String[] args) {
//    subse2("","ab");
        System.out.println(subse2("","ab"));
    }
    static void subse(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subse(p+ch,up.substring(1));

        subse(p+(ch+0),up.substring(1));
        subse(p,up.substring(1));
    }
    static ArrayList<String> subse2(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subse2(p+ch,up.substring(1));
        ArrayList<String> mid=subse2(p+(ch+0),up.substring(1));
        ArrayList<String> right=subse2(p,up.substring(1));
        mid.addAll(right);
        left.addAll(mid);
        return left;
    }
}
