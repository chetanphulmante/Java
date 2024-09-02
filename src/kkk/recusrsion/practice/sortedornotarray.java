package kkk.recusrsion.practice;

public class sortedornotarray {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,6};
        int i=0;
        System.out.println(sorted(ar,i));
    }
//    static boolean ans(int[] ar)
//    {
//        if()
//        {
//            return true;
//        }
//        return false;
//    }
    static boolean sorted(int[] ar,int i)
    {
//        int i=0;
        if(i==ar.length-1)
        {
            return true;
        }
        return ar[i]<ar[i+1] && sorted(ar,i+1);
    }
}
