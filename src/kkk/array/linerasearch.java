package kkk.array;

public class linerasearch {
    public static void main(String[] args) {
        int[] num = {12, 24, 53, 645, 34, 3};
        int target = 53;
        int ans = lsearch(num, target);
        System.out.println(ans);
    }

    //    ## serach in the array and return index of element
    static int lsearch(int[] ar, int target) {
        if (ar.length == 0) {
            return -1;
        }
        for (int i = 0; i < ar.length; i++) {
            int element = ar[i];
            if (element == target) {
                return i;
            }
        }
//        ## enhanced for loop
        for(int element:ar)
        {
            if(element==target)
            {
                return element;
            }
        }
//        ## this line will exectue if none of the return starments have excuted
//        #hence target not found
        return -1;
    }


}
