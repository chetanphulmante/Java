package kkk.practice.Accneture;

public class q7bulbswitch {
    public static void main(String[] args) {
        int[] ar={0,1,0,1};
        System.out.println(ans(ar));
    }
    static int ans(int[] ar)
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            if(count%2==0 && ar[i]==0)
            {
                count++;
            }
            else {
                if(ar[i]==1)count++;

            }
        }
        return count;
    }
}
