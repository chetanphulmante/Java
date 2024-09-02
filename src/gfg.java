import java.io.*;
import java.util.Scanner;

public class gfg {
////    public static void main(String[] args) throws IOException {
////        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
////        int x= Integer.parseInt(br.readLine());
////        System.out.println(x);
////        System.out.println("heyyy");
////    }
//public static void main(String[] args) {
//
//    Scanner inq = new Scanner(System.in);
//    int a = inq.nextInt();
//    int d = inq.nextInt();
//    int n = inq.nextInt();
//    int z= a+(n-1)*d;
//    System.out.println(z);
//
//
//}
//public static int nth_gt(int a,int r,int n)
//{
//    int ans=a*(int)(Math.pow(r,n-1));
//    return ans;
//
//}
//    public static void main(String[] args) {
//
//        Scanner s= new Scanner(System.in);
//        int a=s.nextInt();
//        int r=s.nextInt();
//        int n=s.nextInt();
//        System.out.println(nth_gt(a,r,n));
//    }
    public static String eve(int a)
    {
        if(a%2==0)
        {
            return "even";
        }
//        else {
//            System.out.println("odd");
//        }
        return "odd";

    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
//        System.out.println(eve(a));
        String ans=eve(a);
        System.out.println(ans);
    }
}
