package kkk.recusrsion.sub;
import java.util.*;
import java.util.ArrayList;
import java.util.List;


public class Subset {
    public static void main(String[] args) {
        int[] ar={1,2,2,2};
        System.out.println(subset(ar));

        List<List<Integer>> ans=subsetduplicate(ar);
        for(List<Integer>list:ans)
        {
            System.out.print(list);
        }
    }
    static List<List<Integer>> subset(int[] ar)
    {
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:ar)
        {
            int n=outer.size();
            for(int i=0;i<n;i++)
            {
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
//        outer.add(new ArrayList<>());
        return outer;
    }
    static List<List<Integer>> subsetduplicate(int[] ar)
    {
        Arrays.sort(ar);

        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;

        for(int j=0;j<ar.length;j++)
        {
            start=0;
            if(j>0 && ar[j]==ar[j-1] )
            {
                start=end+1;
            }
            end= outer.size()-1;
            int n=outer.size();
            for(int i=start;i<n;i++)
            {
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(ar[j]);
                outer.add(internal);
            }
        }
//        outer.add(new ArrayList<>());
        return outer;
    }
}

