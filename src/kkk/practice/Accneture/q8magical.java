package kkk.practice.Accneture;

public class q8magical {
    public static void main(String[] args) {
        int n=5;
        System.out.println(ans(n));
    }
    static int ans(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            int zero=0;
            int temp=i;
            while(temp>0)
            {
                if((temp&1)==0) zero++;
                temp>>=1;
            }
            if(zero%2==1)
            {
                count++;
            }
        }
        return count;
    }
}
