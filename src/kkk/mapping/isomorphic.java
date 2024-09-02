package kkk.mapping;
import java.util.*;
public class isomorphic {
    public static void main(String[] args) {

    }
    static boolean  mapi(String s,String t)
    {

        HashMap<Character,Character> mp=new HashMap<>();
        HashSet<Character> st=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(mp.containsKey(ch1))
            {
                if (ch2!=mp.get(ch1)) return false;}

            // } else if (ch2!=mp.get(ch1)) {
            //     return false;

            // }
            else if(st.contains(ch2)){
                return false;
            }
            else{
                mp.put(ch1,ch2);
                st.add(ch2);
            }
        }
        return true;
    }
}
