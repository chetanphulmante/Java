package kkk.String;

public class substring {
    public static void main(String[] args) {
//        String str = "physics";
//        for (int i = 0; i < 4; i++) {
//            System.out.println(str.substring(i));
//        }

        String s="abcd";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length()+1;j++)
            {
                System.out.print(s.substring(i,j)+" ");
            }
        }
    }
}
