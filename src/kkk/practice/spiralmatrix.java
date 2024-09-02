package kkk.practice;

import java.util.Arrays;

public class spiralmatrix {
    public static void main(String[] args) {
        int[][] ar={{1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,181,19,20},
                {21,22,23,24,25}};
        int left=0;
        int right=4;
        int up=0;
        int down=4;
        int[] arr=new int[25];
        int k=0;
        int element=25;
        while(element>0)
        {

            for(int i=left;i<=right && element>0;i++)
            {
                arr[k++]=ar[up][i];
                element--;
            }
//            left++;
            up++;

            for(int i=up;i<=down&& element>0;i++)
            {
                arr[k++]=ar[i][right];
                element--;
            }
//            up++;
            right--;

            for(int i=right;i>=left&& element>0;i--)
            {
                arr[k++]=ar[down][i];
                element--;
            }
//            right--;
            down--;


            for(int i=down;i>=up&& element>0;i--)
            {
                arr[k++]=ar[i][left];
                element--;
            }
//            down--;
            left++;


        }
        System.out.println(Arrays.toString(arr));
    }
}
