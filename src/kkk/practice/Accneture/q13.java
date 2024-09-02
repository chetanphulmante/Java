package kkk.practice.Accneture;

public class q13 {
    public static void main(String[] args) {
        String[] ar={"File_1","File_2","File_3","File_1"};
        System.out.println(version(ar));

    }
    static int version(String[] ar)
    {
        int max=0;
        for(int i=0;i<ar.length;i++)
        {
            String k=ar[i];
            if(k.charAt(0)=='F'&&k.charAt(1)=='i'&&k.charAt(2)=='l'&&k.charAt(3)=='e'&&k.charAt(4)=='_'&&k.charAt(5)>='0' &&k.charAt(5)<='9')
            {
                if(max<k.charAt(5)-'0')
                {
                    max=k.charAt(5)-'0';
                }
            }
        }
        return max;
    }

}
