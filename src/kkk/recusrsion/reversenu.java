package kkk.recusrsion;

public class reversenu {
    public static void main(String[] args) {
        int n=233423;
        reverse1(n);
        System.out.println(sum);
//        System.out.println(reverse2(n));
    }
    static int sum=0;
    static void reverse1(int n)
    {
        if(n==0){
            return ;
        }
//        System.out.println((n%10)+" "+reverse(n/10));
//        int rema=n%10;
//        sum=sum*10+rema;
//        reverse1(n/10);
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
