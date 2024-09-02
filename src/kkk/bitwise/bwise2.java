package kkk.bitwise;

import java.util.Scanner;

public class bwise2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] ar={1,2,2,1,3,4,3,6,4};
        System.out.println(findunique(ar));
    }
    static int findunique(int[] ar)
    {
        int unique=0;
        for(int n:ar) {
             unique^=n;
        }
        return unique;
    }
}
