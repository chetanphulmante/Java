package kkk.recusrsion.sub.q;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class dice {
    public static void main(String[] args) {
        dicesum("",4);
        System.out.println(dicesum2("",4));
    }
    // sum should 4
    static void dicesum(String p,int target)
    {
        if(target==0)
        {
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++)
        {
            dicesum(p+i,target-i);
        }
    }
    static ArrayList<String> dicesum2(String p, int target)
    {
        if(target==0)
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        for(int i=1;i<=6 && i<=target;i++)
        {
            ans.addAll(dicesum2(p+i,target-i));
        }
        return ans;
    }
}
