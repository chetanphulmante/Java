package kkk.practice.Accneture;

import java.util.HashMap;

public class q14 {
    public static void main(String[] args) {
        int[] ar={1,2,3,3,5,5,5};
        System.out.println(count(ar));
    }
    static int count(int[] ar)
    {
        if(ar.length==1)
        {
            return 0;
        }
        if(ar[0]==ar[ar.length-1])
        {
            return 0;
        }
        int idx=ar.length-1;
        while(idx>=0&&ar[ar.length-1]==ar[idx])
        {
            idx--;
        }
        int coun=0;
        int max2=ar[idx];
        while(idx>=0&&ar[idx]==max2)
        {
            coun++;
            idx--;
        }
        return coun;
    }
//    static int count2(int[] ar)
//    {
//        HashMap<Integer,Integer> map=new HashMap<>();
//        for(int i:ar)
//        {
//            if(map.containsValue(i))
//            {
//                int k=map.get(i);
//                map.put(i,k+1);
//            }
//            else {
//                map.put(i,1);
//            }
//        }
//        int a=map.size();
//
//    }
}
