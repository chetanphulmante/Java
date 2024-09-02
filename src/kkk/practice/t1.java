package kkk.practice;

public class t1 {
    public static void main(String[] args) {
//        bbaabcd
        String str="bbaabcd";
        int[] ar=new int[257];
        for(char c:str.toCharArray())
        {
            ar[c]++;
        }
        for(int i=1;i<=256;i++)
        {
            if(ar[i]>0)
            {
                System.out.print((char)(i) +""+ ar[i]);
            }
        }
    }
}
