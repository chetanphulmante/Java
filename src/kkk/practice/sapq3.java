package kkk.practice;

import java.util.Arrays;

public class sapq3 {
    public static void main(String[] args) {
        int[] ar={1,1,1,0,1,1,1,1};
        int days=2;
        System.out.println(Arrays.toString(print(ar,days)));

    }
    static int[] print(int[] charstr,int days)
    {

//        int[] answer=new int[charstr.length];
        int k=days%(2*charstr.length-1);
        for(int i=0;i<k;i++)
        {
            int[] answer=new int[charstr.length];
            for(int j=0;j<charstr.length;j++)
            {
                if(j==0)
                {
                    answer[j]=0^charstr[j+1];
                }
                else if(j==charstr.length-1)
                {
                    answer[j]=0^charstr[j-1];
                }
                else {
                    answer[j]=charstr[j-1]^charstr[j+1];
                }
            }
            charstr=answer;
//            return charstr;
        }
        int[] answer=charstr;
        return answer;
    }
}
