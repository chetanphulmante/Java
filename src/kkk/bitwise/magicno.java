package kkk.bitwise;

public class magicno {
    public static void main(String[] args) {
        int n=30;
        System.out.println(magicans(n));
    }
    static int magicans(int n)
    {
        int ans=0;
        int base=5;
        while(n>0)
        {
            int last=n&1;
            n=n>>1;
            ans +=last*base;
             base=base*5;
        }
        return ans;
    }
}
