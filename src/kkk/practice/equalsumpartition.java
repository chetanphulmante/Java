package kkk.practice;

public class equalsumpartition {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,2};

        System.out.println(ans(ar));

    }
    static int totalsum(int[] ar)
    {
        int sum=0;
        for(int in:ar)
        {
            sum+=in;
        }
        return sum;
    }
    static boolean ans(int[] ar)
    {
        int prefsum=0;
        int tsum=totalsum(ar);
        for(int i=0;i<ar.length;i++)
        {
            prefsum+=ar[i];
//            int suffix=tsum-prefsum;
//            if(prefsum==suffix)
//            {
//                return true;
//            }
            if(2*prefsum==tsum)
            {
                return true;
            }
        }
        return false;
    }



//    solution 1 for partition
//    static boolean ans(int[] ar)
//    {
////        boolean flag=false;
//        int[] ans1=prefixsumans(ar);
//        for(int i=0;i<ar.length-1;i++)
//        {
//            int suffix=ar[ar.length-1]-ar[i];
//            if(suffix==ar[i])
//            {
//                return true;
//            }
//        }
//        return false;
//    }
//    static int[] prefixsumans(int[] ar)
//    {
//
//        for(int i=1;i<ar.length;i++)
//        {
//            ar[i]+=ar[i-1];
//        }
//        return ar;
//    }
}
