package kkk.practice.Accneture;

public class q12largestcommonsubstring {
    public static void main(String[] args) {
        String s1="adventure";
        String s2="future";

        int[] result=new int[2];

        int ans=totallength(s1,s2,0,0,0,result);
//        System.out.println(result[1]);
        int max=result[0];
        int idx=result[1];
        String temp=s1.substring(idx,idx+ans);
        int final1=0;
        for(int i=0;i<temp.length();i++)
        {
            final1+= temp.charAt(i);
        }
        System.out.println(final1);

    }
    static int totallength(String s1,String s2,int i,int j,int count,int[] result)
    {
        if(i==s1.length() || j==s2.length())
        {
            return count;
        }
        if(s1.charAt(i)==s2.charAt(j))
        {

            count= totallength(s1,s2,i+1,j+1,count+1,result);
            if(result[0]<count)
            {
                result[0]=count;
                result[1]=i-result[0]+1;
            }

        }
        int count1=totallength(s1,s2,i+1,j,0,result);
        int count2=totallength(s1,s2,i,j+1,0,result);

        return Math.max(count,Math.max(count1,count2));
    }

}
