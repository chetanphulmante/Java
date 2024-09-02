package kkk.practice;
import java.util.*;

public class spiralmatrix1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        int n=sc.nextInt();

//        System.out.println(spiral(n));
        int[][] result=spiral(n);
        for(int[] i:result)
        {
            for(int num:i)
            {
                System.out.print(num+" ");
            }
//            System.out.println(Arrays.toString(i));
            System.out.println();
        }
    }
    static int[][] spiral(int n)
    {
        int element=n*n;
        int left=0;
        int right=n-1;
        int up=0;
        int down=n-1;
        int k=1;
        int[][] ans=new int[n][n];
        while(element>0)
        {
            for(int i=left;i<=right&&element>0;i++)
            {
                ans[up][i]=k++;
                element--;
            }
            up++;
            for(int i=up;i<=down&&element>0;i++)
            {
                ans[i][right]=k++;
                element--;
            }
            right--;
            for(int i=right;i>=left&&element>0;i--)
            {
                ans[down][i]=k++;
                element--;
            }
            down--;
            for(int i=down;i>=up&&element>0;i--)
            {
                ans[i][left]=k++;
                element--;
            }
            left++;
        }
        return ans;
    }
}
