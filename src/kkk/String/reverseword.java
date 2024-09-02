package kkk.String;

public class reverseword {
    public static void main(String[] args) {
        String str=" i am an online educator";
        String ans="";
        StringBuilder sb=new StringBuilder();
        for(char ch:str.toCharArray())
        {
            if(ch!=' ')
            {
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans+=sb;
                ans+=" ";
                sb=new StringBuilder();
            }
        }
        sb.reverse();
        ans+=sb;
        System.out.println(ans);
    }
}
