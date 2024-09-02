package kkk.recusrsion;

public class palindrome {
    public static void main(String[] args) {
        int n=123434321;
        System.out.println(palindrome(n));

    }
    static boolean palindrome(int n)
    {
        return n==reverse2(n);
    }
    static int reverse2(int n)
    {
        int digit=(int)(Math.log10(n))+1;
        return helper(n,digit);
    }
    static int helper(int n,int digit)
    {
        if(n%10==n)
        {
            return n;
        }
        int rema=n%10;
        return rema*(int)(Math.pow(10,digit-1))+helper(n/10,digit-1);
    }
}
