package kkk.practice;

public class sumRtoK {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,6,7,8,9};
        int r=2;
        int k=4;
        int n=ar.length;
        int[] ans=prefixsumans(ar,n);
        System.out.println(ans[k]-ans[r-1]);

    }
    static int[] prefixsumans(int[] ar,int n)
    {

        for(int i=1;i<n;i++)
        {
            ar[i]+=ar[i-1];
        }
        return ar;
    }
}
