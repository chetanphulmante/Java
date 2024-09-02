package kkk.practice;

public class Istuppercaseletter {
    public static void main(String[] args) {
        String str="av@odfEnweofhaoenfKKdfadofhaon";
        char res=first(str);
        System.out.println(res);
    }
    static char first(String str)
    {
        for(char c:str.toCharArray()) // for(int i=0;i<str.length();i++)
        {                             // if(Character.isUpperCase(str.charAt(i)))
            if(Character.isUpperCase(c))
            {
                return c;
            }
        }
        return '0';
    }
}
