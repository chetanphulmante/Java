package kkk.array;

import java.util.Arrays;

public class bsearch2d {
    public static void main(String[] args) {
        int [][] arr={
                {10,20,30},
                {41,42,43},
                {50,55,60}
        };
        System.out.println(Arrays.toString(search(arr,43)));

    }
    static int[] search(int[][] matrix,int target){
        int r=0;
        int c=matrix.length-1;
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target)
            {
                return new int[]{r,c};
            }
            if(matrix[r][c]<target){
                r++;
            }
            else {
                c--;
            }
        }return new int[]{-1,-1};
    }
}
