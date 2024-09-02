package kkk.recusrsion.practice;

public class remove_a_s {
    public static void main(String[] args) {
        String str="abcdaahdsa";
//        int i=0;
//        System.out.println(output(str,0));
        System.out.println(output2(str));
    }
    static String output(String str,int i)
    {
        String ans="";
        if(i==str.length())
        {
            return ans;
        }
        if(str.charAt(i)!='a')
        {
            ans+=str.charAt(i);
        }
        return ans+output(str,i+1);
    }
    static String output2(String str)
    {
        if(str.length()==0)
        {
            return "";
        }
        char ch=str.charAt(0);
        if(ch=='a')
        {
            return output2(str.substring(1));
        }
        else {
            return ch+output2(str.substring(1));
        }

    }
}
