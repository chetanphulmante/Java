//package kkk.practice;
//
//public class hardmountain {
//    public static void main(String[] args) {
//
//
//    }
//    int search(MountainArray mountainrArr,int target){
//        int peak=peakIndexInMountainArray(mountainArr);
//        int firsttry=orderagnosticbsearch(mountainArr,target,0,peak);
//        if(firsttry!=-1){
//            return firsttry;
//        }
////        try to search in second half
//        return orderagnosticbsearch(mountainArr,target,peak+1,mountainArr.length()-1);
//    }
//    public int peakIndexInMountainArray(MountainArray mountainrArr) {
//
//        int s=0;
//        int e=mountainArr.length()-1;
//        while(s<e)
//        {
//            int mid=s+(e-s)/2;
//            if(mountainarr.get[mid]>mountainarr.get[mid+1])
//            {
////                you are in dec part of array
////                this may be the ans but look at left
//                e =mid;
//            }
//            else{
////                u r in asc part of array
//
//                s=mid+1; // bcoz we know that mid+1 element > mid element
//            }
//        }
////        in the end s==e and pointing to the largest no. bcoz of the  2 checks
////        s and e r always trying to find maz elemnt in the above 2 checks
////        hence, when they are pointing to just one element that is the max one  checks say
//        return s;
//    }
//    static int orderagnosticbsearch(MountainArray mountainarr, int target, int s, int e)
//    {
////        int s=0;
////        int e=arr.length-1;
//        boolean isasc=mountainarr.get[s]<mountainarr.get[e];
//        while(s<=e)
//        {
//            int mid=s+(e-s)/2;
//            if(mountainarr.get[mid]==target){
//                return mid;
//            }
//            if(isasc) {
//                if (target > mountainarr.get[mid]) {
//                    s = mid + 1;
//                } else if (target < mountainarr.get[mid]) {
//                    e = mid - 1;
//                }
//            }
//            else{
//                if (target < mountainarr.get[mid]) {
//                    s = mid + 1;
//                } else if (target > mountainarr.get[mid]) {
//                    e = mid - 1;
//                }
//            }
//
//        }
//        return -1;
//    }
//}
