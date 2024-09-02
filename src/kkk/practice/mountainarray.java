package kkk.practice;

public class mountainarray  {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr) {

        int s=0;
        int e=arr.length-1;
        while(s<e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]>arr[mid+1])
            {
//                you are in dec part of array
//                this may be the ans but look at left
                e =mid;
            }
            else{
//                u r in asc part of array

                s=mid+1; // bcoz we know that mid+1 element > mid element
            }
        }
//        in the end s==e and pointing to the largest no. bcoz of the  2 checks
//        s and e r always trying to find maz elemnt in the above 2 checks
//        hence, when they are pointing to just one element that is the max one  checks say
        return s;
    }
}
