package kkk;
import java.util.Scanner;
public class lsearchstring {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String name=in.next();
        char target=in.next().charAt(0);
//        String name="kunal";
//        char target='r';
        System.out.println(search(name,target));
    }
    static boolean search(String str, char target)
    {
        if(str.length()==0)
        {
            return false;
        }
//        for(int i=0;i<str.length();i++)
//        {
//            if(target==str.charAt(i))
//            {
//                return true;
//            }
//        }
        for (char ch: str.toCharArray())
        {
            if(ch==target)
            {
                return true;
            }
        }
        return false;
    }
}
