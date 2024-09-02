package kkk.practice;

public class infinitearray {
    public static void main(String[] args) {
    int[] ar={2,3,4,11,15,18,2,6,27,29,35,38,100,150,157};
    int target=157;
        System.out.println(ans(ar,target));
    }
    static int ans(int[] ar,int target){
//        first find the range
        // start with the box of size 2
        int s =0;
        int e=1;

//        condition for the taget to lie in range
        while(target> ar[e]){
            int temp=e+1;
            e=e+2*(e-s+1);
            s=temp;
        }
        return search(ar,target,s,e);
    }
    static int search(int[] ar, int target,int s,int e)
    {
//        int i=0;
//        int k=ar.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(target<ar[mid])
            {
                e=mid-1;
            }
            else if(ar[mid]<target)
            {
                s=mid+1;

            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
