package kkk.bitwise;

import java.util.Scanner;

public class bwise1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int number=in.nextInt();
        System.out.println(isodd(number));

    }
    static boolean isodd(int number){
        return (number & 1) == 1;
    }


}