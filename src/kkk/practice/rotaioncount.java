package kkk.practice;

public class rotaioncount {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,1,2,3};
        System.out.println(countrotaion(arr));
    }

    private static int countrotaion(int[] arr) {
    int pivot=findpivot(arr);
    return pivot+1;
    }
//    use this for non duplicate
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
//    use tthis for duplicate
    static int findduplicatepivot(int[] arr ){
        int s=0;
        int e=arr.length-1;
        while(s<=e) {
            int mid = s + (e - s) / 2;
//            4 cases we discussed early
            if (mid < e && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > s && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
//            if elemts at middle ,start,end are equal then jusk skip the duplicates

            if (arr[mid] == arr[s] && arr[mid] == arr[e]){
//            skip the duplicates
//                note:what if these elements at start and end were the pivot
                if (arr[s] > arr[s + 1]) {
                    return s;
                }

                s++;
//            check end is pivot
                if (arr[e] < arr[e - 1]) {
                    return e - 1;
                }
                e--;
            }
//            left side is sorted ,so pivot should be in right
            else if(arr[s]<arr[mid] || (arr[s]==arr[mid] && arr[mid]>arr[e])){
                s=mid+1;
            }


            else {
                e=mid-1;
            }


        }
        return -1;

    }

}
