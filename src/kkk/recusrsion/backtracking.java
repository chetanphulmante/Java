package kkk.recusrsion;

public class backtracking {
    public static void main(String[] args) {

    }
    static int count(int c,int r)
    {
        if(r==1 || c==1)
        {
            return 1;
        }
        int left=count(c-1,r);
        int right=count(c,r-1);
        return left+right;

    }
}
