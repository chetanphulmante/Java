package kkk;
import java.sql.SQLOutput;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
//        int ans =sum2();
//        System.out.println("output is="+ans);
        int ans =sum3(20,30);
        System.out.println(ans);
    }

    static int sum2(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter no1=");
        int num1=in.nextInt();
        System.out.print("enter no2=");
        int num2=in.nextInt();
        int sum=num1+num2;
        return sum;
    }
    static int sum3(int a,int b){
        int sum=a+b;
        return sum;
    }
}
