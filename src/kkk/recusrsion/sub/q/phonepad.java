package kkk.recusrsion.sub.q;
import java.util.*;
public class phonepad {
    public static void main(String[] args)
    {
        pad("","23");
        System.out.println(pad2("","23"));
    }
    static void pad(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.print(p+" ");
            return ;
        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++)
        {
            char ch=(char)('a'+i);
            pad(p+ch,up.substring(1));

        }
    }
    static ArrayList<String> pad2(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        ArrayList<String> ans=new ArrayList<>();
        for(int i=(digit-1)*3;i<digit*3;i++)
        {
            char ch=(char)('a'+i);
            ans.addAll(pad2(p+ch,up.substring(1)));
        }
        return ans;
    }
}
