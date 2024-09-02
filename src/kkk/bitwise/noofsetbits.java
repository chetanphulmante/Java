package kkk.bitwise;

public class noofsetbits {
    public static void main(String[] args) {
        int n=9;
        int count=0;
//        while(n>0)
//        {
//            if((n&1)==1)
//            {
//                count++;
//            }
//            n=n>>1;
//        }
        while(n>0)
        {
            count++;
            n=(n&(n-1)); //or n-=(n& -n)
        }
        System.out.println(count);
    }
}
