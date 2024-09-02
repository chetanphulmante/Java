package kkk.practice.Accneture;

public class q6 {
    public static void main(String[] args) {
        String str="my name is chetan ph";
        int n=1;
        System.out.println(ans(str,n));
    }
    static String ans(String str,int n)
    {
//        String ans1="";
////        String[] ar=new String[];
//        int count=0;
//        int total=0;
//        for(int i=0;i<str.length();i++)
//        {
//            if(str.charAt(i)==' ')
//            {
//                count++;
//            }
//        }
//        if((count+1)==n)
//        {
//            return str;
//        }
////        String[] ar=new String[count+1];
//        for(int i=0;i<str.length();i++)
//        {
////            if(str.charAt(i)==' ')
////            {
////                ar[i]==
////            }
//            if(str.charAt(i)==' ')
//            {
//                total++;
//            }
//            if(total==n)
//            {
//                break;
//            }
//            ans1+=str.charAt(i);
//        }
//
//        return ans1;
        int count=0;
        for(int i=0;i<str.length();i++ )
        {
            if(str.charAt(i)==' ')
            {
                count++;
                if(count==n)
                {
                    return str.substring(0,i);
                }
            }
        }
        return str;
    }
}
