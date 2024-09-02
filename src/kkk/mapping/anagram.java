package kkk.mapping;
import java.util.*;
public class anagram {
    public static void main(String[] args) {
        String s1="knee";
        String s2="keen";
        System.out.println(anagram(s1,s2));

    }
    static HashMap<Character,Integer> makefre(String str)
    {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(!mp.containsKey(ch))
            {
                mp.put(ch,1);
            }
            else {
                int freq=mp.get(ch);
                mp.put(ch,freq+1);
            }
        }
        return mp;
    }
    static boolean anagram(String str1,String str2)
    {
        if(str1.length()!=str2.length()) return false;

        HashMap<Character,Integer> mp1=makefre(str1);
        HashMap<Character,Integer> mp2=makefre(str2);
        return mp1.equals(mp2);
    }
    static boolean anagram2(String str1,String str2) {
        if (str1.length() != str2.length()) return false;

        HashMap<Character, Integer> mp = makefre(str1);
        for(int i=0;i<str2.length();i++)
        {
            char ch=str2.charAt(i);
            if(!mp.containsKey(ch)) return false;
            int currfreq=mp.get(ch);
            mp.put(ch,currfreq-1);
            if(mp.get(ch)==0)
            {
                mp.remove(ch);
            }
        }
        if(!mp.isEmpty()) return false;
//        for(int i:mp.values()){
//            if(i!=0) return false;
//        }
        return true;
    }

}
