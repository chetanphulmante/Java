package gfg;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println(countdistintelemnt(a,n));

    }
    static int countdistintelemnt(int[] a,int n)
    {
        int count=0;
        boolean isdistinct =true;
        for(int i=0;i<a.length;i++ )
        {
            for(int j=0;j<i;j++)
            {
                if(a[i]==a[j])
                {
                    isdistinct=false;
                    break;
                }
            }
            if(isdistinct==true)
            {
                count++;
            }

        }
        return count;

    }
}
