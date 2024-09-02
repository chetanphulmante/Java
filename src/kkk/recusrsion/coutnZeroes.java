package kkk.recusrsion;

public class coutnZeroes {
    public static void main(String[] args) {
        int n=1020302303;
        int count=0;
        System.out.println(zeroes(n,count));

    }
    static int zeroes(int n,int count)
    {
        if(n==0)
        {
            return count;
        }
        if(n%10==0)
        {
//            count++;
            return zeroes(n/10,count+1);
        }
        else{
            return zeroes(n/10,count);
        }

    }
}
