package kkk.practice.Accneture;

import java.util.ArrayList;

public class q11decode {
    public static void main(String[] args) {
        String str="101011010101110110";
        System.out.println(ans(str));
    }
    static String ans(String str)
    {
//        ArrayList<Integer> list=new ArrayList<>();
        String ans1="";
        int count=0;
        for(int i=0;i<str.length();i++)
        {

            if(str.charAt(i)=='1')
            {
                count++;
            }
//            if(str.charAt(i)=='0')
//            {
//                list.add(count);
//                count=0;
//            }
            else {
                ans1+=(char)('A'+count-1);
                count=0;
            }
        }
        if(count>0){
        ans1+=(char)('A'+count-1);}

//        list.add(count);
//        for(int i:list)
//        {
//            ans1+=(char)('a'+i-1);
//        }
        return ans1;
    }
}
