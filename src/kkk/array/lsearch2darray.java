package kkk.array;

import java.util.Arrays;

public class lsearch2darray {
    public static void main(String[] args) {
        int[][]ar={{1,3,2},{23,56,22},{27,34,2}};
        int target=2;
        int[] ans=search(ar,target);

        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] ar,int target)
    {
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar[i].length;j++)
            {
                if(target==ar[i][j])
                {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1};
    }

}
