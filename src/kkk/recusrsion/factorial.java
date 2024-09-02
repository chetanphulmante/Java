package kkk.recusrsion;

public class factorial {
    public static void main(String[] args) {
//        fact(5);
        System.out.println(fun(5));
    }
    static int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int ans=n*fact(n-1);
        return ans;
    }
    static int fun(int n)
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println(i);
        }
        for(int i=0;i<=5;++i)
        {
            System.out.println(i);
        }
        for(int i=5;i>=0;i--)
        {
            System.out.println(i);
        }
        for(int i=5;i>=0;--i)
        {
            System.out.println(i);
        }
        return -1;
    }
}
