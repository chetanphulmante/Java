package kkk.array;

public class bsearch1 {
    public static void main(String[] args) {
        int[] ar={2,3,5,9,14,16,18};
        int target=5;
        System.out.println(search(ar,target));
    }
    static int search(int[] ar,int target)
    {
        int s=0;
        int e=ar.length;
        while(s<=e)
        {
            int mid=(s+e)/2;
            if(ar[mid]==target)
            {
                return ar[mid];
            }
            else if(ar[mid]<target)
            {
                s=mid+1;

            }
            else {
                e=mid-1;
            }
        }
        return ar[e];
    }
}
