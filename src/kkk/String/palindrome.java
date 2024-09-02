package kkk.String;

import java.util.Arrays;

public class palindrome {
    public static void main(String[] args) {
        String variable1="kk raj";
        System.out.println(Arrays.toString(variable1.toCharArray()));
        System.out.println(Arrays.toString(variable1.getBytes()));
//        Scanner in=new Scanner(System.in);
//        String variable=in.next();
//        boolean ans;
//        System.out.println(ans(variable));
    }
    static boolean ans(String variable)
    {
        variable =variable.toLowerCase();
        if(variable==null || variable.length()==0 )
        {
            return true;
        }
//        String Variable2=Arrays.toString(variable.toCharArray());
       for(int i =0;i<=variable.length()/2;i++)
       {

           char start=variable.charAt(i);
           char end=variable.charAt(variable.length()-1-i);
           if(start!=end)
           {
               return false;
           }

       }
       return true;
    }

}
