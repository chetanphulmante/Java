package kkk.practice;

public class t2 {
    public static void main(String[] args) {
        String str="aabbssdddef";
        String ans=""+str.charAt(0);
        int count=1;
        for(int i=1;i<str.length();i++)

        {
            char current=str.charAt(i);
            char pre=str.charAt(i-1);
            if(current==pre)
            {
                count++;
            }
            else {
                if(count>1)ans+=count;

                count=1;
                ans+=current;
            }

        }
        if(count>1)ans+=count;

        System.out.println(ans);









//        int[] ar=new int[257];
//        for(char ch:str.toCharArray())
//        {
//            ar[ch]++;
//        }
//        for(int i=0;i<257;i++)
//        {
//            if(ar[i]>0) {
//                System.out.print((char)i+""+ar[i]);
//            }
//        }
    }
}
