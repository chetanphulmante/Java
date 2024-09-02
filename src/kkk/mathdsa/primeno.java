package kkk.mathdsa;

public class primeno {
    public static void main(String[] args) {
        int n=500;
        boolean[] prime=new boolean[n+1];
        itis(n,prime);
    }
    static void itis(int n,boolean[] prime){
        for(int j=2;j*j<=n;j++)
        {
            if(!prime[j])
            {
                for(int i=j*2;i<=n;i+=j)
                {
                    prime[i]=true;
                }
            }

        }
        for(int i=2;i<=n;i++)
        {
            if(!prime[i])
            {
                System.out.print(i+ " ");
            }
        }
    }
}
