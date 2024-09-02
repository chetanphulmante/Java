package kkk.array;

import java.util.Arrays;

public class bsearch2d1 {
    public static void main(String[] args) {
       int[][] arr={
               {1,2,3},
               {4,5,6},
               {7,8,9},
       };
        System.out.println(Arrays.toString(search(arr,8)));
    }
    static int[] bsearch(int[][] matrix,int r,int cstart,int cend,int target){
    while(cstart<=cend){
        int mid=cstart+(cend-cstart)/2;
        if(matrix[r][mid]==target)
        {
            return new int[]{r,mid};
        }
        else if(matrix[r][mid]<target)
        {
            cstart=mid+1;
        }
        else {
            cend=mid-1;
        }
    }
    return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix,int target)
    {
        int r=matrix.length;
        int c=matrix[0].length;
        if(r==1)
        {
            return bsearch(matrix,0,0,c-1,target);

        }
        int rstart=0;
        int rend=r-1;
        int cmid=c/2;
        while(rstart<(rend-1)){
            int mid=rstart+(rend-rstart)/2;
            if(matrix[mid][cmid]==target)
            {
                return new int[]{mid,cmid};
            }
            if(matrix[mid][cmid]==target)
            {
                rstart=mid;
            }
            else{
                rend=mid;
            }

        }

//        now we have 2 rows
//        check whethe the tarhget is in the col of 2 rows
        if(matrix[rstart][cmid]==target){
            return new int[]{rstart,cmid};
        }
        if(matrix[rstart+1][cmid]==target){
            return new int[]{rstart+1,cmid};
        }
//        // SEARCH IN  1st half
        if(target<=matrix[rstart][cmid-1]){
            return bsearch(matrix,rstart,cmid+1,c-1,target);
        }
        // search in 2nd half
        if(target<=matrix[rstart][cmid+1]){
            return bsearch(matrix,rstart,cmid+1,c-1,target);

        }
        // search in 3rd half
        if(target<=matrix[rstart+1][cmid-1]){
            return bsearch(matrix,rstart+1,0,cmid-1,target);
        }
        //search in 4th half
        else{
            return bsearch(matrix,rstart+1,cmid+1,c-1,target);
        }
    }
}
