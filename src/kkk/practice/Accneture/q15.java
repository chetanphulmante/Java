package kkk.practice.Accneture;

public class q15 {
    public static void main(String[] args) {
        System.out.println(solve(100,4,105,80,2));
    }
    static int solve(int m, int n,int input1,int input2, int input3)
    {
        int count=0;
//        while(input1>0) {

            int k = m * input2;
            int l = (input2/input3)*n;
            if (input1 <=n)
            {
                count+=input3;
                input1-=n;
                return count;
            }
            if(l<=m && input1>=l)
            {
                count+=input2;
                return count+solve(m,n,input1-m,input2,input3);
            }
            if(l<=m && input1<l)
            {
                count+=input3;
                return count+solve(m,n,input1-n,input2,input3);
            }
            if(l>m)
            {
                count+=input3;
                {
                    return count+solve(m,n,input1-n,input2,input3);
                }
//            }

        }
        return count;
    }
}
