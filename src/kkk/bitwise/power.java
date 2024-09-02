package kkk.bitwise;

public class power {
//    time complexity log n
    public static void main(String[] args) {
        int bas=3;
        int power =6;

        int ans=1;

        while(power>0)
        {
            if((power &1)==1)
            {
                ans*=bas;
            }
            bas*=bas;
            power=power>>1;
        }
        System.out.println(ans);

    }
}
