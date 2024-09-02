package kkk.recusrsion;

public class patternn {
    public static void main(String[] args) {
        int n=4;
        prinoattern(n);
    }
    static void prinoattern(int n)
    {
        if(n==0)
        {
//            System.out.println("*");
            return;
        }
//        for(int i=0;i<n;i++) {
//            System.out.print("*");
//        }
//        System.out.println();
        printstars(n);
        System.out.println();
        prinoattern(n-1);
    }
    static void printstars(int stars)
    {
        if(stars==0)
        {
            return;
        }
        System.out.print("* ");
        printstars(stars-1);
    }

}
