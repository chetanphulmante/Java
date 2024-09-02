package kkk.practice.Accneture;

public class q4 {
    public static void main(String[] args) {
        int target=11;
//        AtomicInteger
        int k=findingsetbit(target);
        System.out.println(k);
    }
    static int findingsetbit(int target)
    {
        int count=0;
//        int ans=0;
//        while(target>0)
//        {
//            count++;
//            target=(target & (target-1));
//        }
        while(target>0)
        {
            if((target&1)==1)
            {
                count++;

            }
            target=target>>1;
        }

        return (int) (Math.pow(2,count)-1);
//        int i=0;
//        while(count>0)
//        {
////            ans+=Math.pow(2,count-1);
//            ans|=1<<i;
//            i++;
//            count--;
//        }
//        return ans;
    }
}
