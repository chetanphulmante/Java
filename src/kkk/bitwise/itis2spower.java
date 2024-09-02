package kkk.bitwise;

public class itis2spower {
    public static void main(String[] args) {
        int n=16384;
        System.out.println(ans(n));
    }
    static boolean ans(int n){
        return ((n & (n-1))==0);


    }

}
