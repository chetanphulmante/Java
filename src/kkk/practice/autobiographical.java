package kkk.practice;

import java.util.*;

public class autobiographical {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sr=sc.next();
        int count=0;
        int zero=0;
        int total=0;

        int number=sr.length();
        int[] digits=new int[number];
        for (int i = 0; i < number; i++) {
//            digits[i] = Character.getNumericValue(sr.charAt(i));
            digits[i]=sr.charAt(i)-'0';
        }



    }
}
