package kkk.recusrsion.sub;

import java.util.ArrayList;

public class subseq {
    public static void main(String[] args) {
//        String str="abc";
//        subs("","abc");
//        System.out.println();
        System.out.println(subse("","abc"));

    }
//    static void subs(String p,String up)
//    {
//        if(up.isEmpty())
//        {
//            System.out.println(p);
//            return;
//        }
//        char ch=up.charAt(0);
//        subs(p+ch,up.substring(1));
//        subs(p,up.substring(1));
//    }

    // using ArrayList
    static ArrayList<String> subse(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left =subse(p+ch,up.substring(1));
        ArrayList<String> right=subse(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
