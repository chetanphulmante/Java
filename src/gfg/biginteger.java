package gfg;

import java.math.BigInteger;
import java.util.Scanner;

public class biginteger {
    public static void main(String[] args) {
//   1.     BigInteger b=new BigInteger("54");
//        //
//        String a= "12345678";
//        BigInteger B=new BigInteger(a);
//        //
//        int c=12343535;
//        BigInteger C=BigInteger.valueOf(c);
//    1.    //
//   2.     //mathematical calc
//        BigInteger A=new BigInteger("54");
//        BigInteger K= new BigInteger("345");
//        BigInteger q=A.add(K);
//        // A.multiply(K)
//       // A.divide(K);
//        //A.subtract(K);
//        //A.remainder(K);
//        //A.compareTo(K); // it gives output -1,0,1
////       // conversion
//        int a=A.intValue();
//        long b=A.longValue();
//      2.  String h=A.toString();
//        3.
//        Scanner in=new Scanner(System.in);
//        int n=in.nextInt();
//        System.out.println(factorial(n));
//        3.
//        4.fibonacci
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(fibonacci(n));
//        4.
    }
//      3.
//     static BigInteger factorial(int n) {
//        BigInteger k=new BigInteger("1");
//        for(int i=2;i<=n;i++)
//        {
//            BigInteger x=BigInteger.valueOf(i);
//            k=k.multiply(x);
//        }
//        return k;
//    }
//    3.
//    4.
    static BigInteger fibonacci(int n){
        BigInteger a=BigInteger.valueOf(0);
        BigInteger b=BigInteger.valueOf(1);
        BigInteger c=BigInteger.valueOf(1 );
        for(int i=1;i<n;i++)
        {
            c=a.add(b);
            a=b;
            b=c;
        }
    return b;
    }

//    4.
}

