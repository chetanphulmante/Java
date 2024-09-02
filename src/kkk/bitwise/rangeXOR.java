package kkk.bitwise;

public class rangeXOR {
    public static void main(String[] args) {
        //range xor for a,b= xor(b) ^ xor(a)
        int a=3;
        int b=9;
        int k=xor(b)^xor(a-1);
        System.out.println(k);
    }
//    this will give xor from o to n
    static int xor(int a)
    {
        if(a%4==0)
        {
            return a;
        }
        if(a%4==1)
        {
            return 1;
        }
        if(a%4==2)
        {
            return a+1;
        }
//        if(a%4==0)
//        {
            return 0;
    //    }
    }
}
