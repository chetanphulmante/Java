package kkk.bitwise;

public class nuofdigit {
    public static void main(String[] args) {
        int n=17;
        int base=2;
        int ans=0;
        ans=(int)(Math.log(n)/Math.log(base))+1;
        System.out.println(ans);
    }
}
