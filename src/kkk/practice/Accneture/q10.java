package kkk.practice.Accneture;

public class q10 {
    public static void main(String[] args) {
        String str="abgfki";
        System.out.println(countno(str));
    }
    static int countno(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {

            char ch=str.charAt(i);
            if(ch=='A'||ch=='a'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                count++;
            }

        }
        int ans=str.length()-count;
//        return ans;
        return factorial(ans);
    }
    static int factorial(int ans)
    {
        int sum=1;
        while(ans>0)
        {
            sum*=ans--;
//            ans--;
        }
        return sum;
    }
}
