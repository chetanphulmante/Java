package kkk.array;

public class bsearch {
    public static void main(String[] args) {
      int[] ar={11,23,24,55,34,78};
      int target=34;
        System.out.println(search(ar,target));
    }
    static int search(int[] ar, int target)
    {
        int i=0;
        int k=ar.length-1;
        while(i<=k)
        {
            int mid=(i+k)/2;
            if(ar[mid]==target)
            {
                return mid;
            }
            else if(ar[mid]<target)
            {
                i=mid+1;

            }
            else {
                k=mid-1;
            }
        }
        return -1;
    }
}
