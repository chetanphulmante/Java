package kkk.practice;

public class rotatedbsearch {
    public static void main(String[] args) {
    int[] arr={4,5,6,7,1,2,3};
        System.out.println(findpivot(arr));
    }
    static int search(int[] nums, int target){
        int pivot= findpivot(nums);
//        if u did not find a pivot , it means the array is not rotated
        if(pivot==-1)
        {
//            just do binary search
            return bsearch(nums,target,0,nums.length-1);
        }
//        if pivot is found,you have found 2 asc sorted arrays
        if(nums[pivot]==target){
            return pivot;
        }

        if(target>=nums[0])
        {
            return bsearch(nums,target,0,pivot-1);
        }
        return bsearch(nums,target,pivot+1,nums.length-1);
    }
    static int bsearch(int[] nums,int target,int s,int e)
    {
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(target<nums[mid])
            {
                e=mid-1;
            }
            else if(target>nums[mid])
            {
                s=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;


    }
//    this will not work in duplicate values
    static int findpivot(int[] arr ){
        int s=0;
        int e=arr.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
//            4 cases we discussed early
            if(mid<e && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if(mid>s && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[s])
            {
                e=mid-1;
            }
            else {
                s=mid+1;
            }

        }
        return -1;

    }
//    static int rosearch(int[] arr, int pivot){
//
//    }
}
