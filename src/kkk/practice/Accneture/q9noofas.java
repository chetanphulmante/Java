package kkk.practice.Accneture;

public class q9noofas {
    public static void main(String[] args) {
        String str="abdabfgaaaava";
        int k=3;
        System.out.println(ans(str,k));
    }
    static int ans(String str,int k)
    {
        int count=0;
        int max=0;
        int i=0;
        int j=-1;
        while(j<k-1)
        {
            if(str.charAt(++j)=='a') count++;
        }
        while(j<str.length()-1)
        {
            if(str.charAt(i++)=='a') count--;
            if(str.charAt(++j)=='a') count++;
            max=Math.max(max,count);
        }
        return max;
    }
}
