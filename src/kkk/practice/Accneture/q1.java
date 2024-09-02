package kkk.practice.Accneture;

public class q1 {
    public static void main(String[] args) {
        int[] ar={2,3,9,5,3,5,7,6};
//        System.out.println(countsuperior(ar));
        System.out.println(area(5.1f));
    }
    static int countsuperior(int[] arr)
    {
        int count=0;
        int superior=0;
        for(int i=arr.length-1;i>0;i--)
        {
            if(superior<arr[i])
            {
                count++;
                superior=arr[i];
            }
        }
        return count;
    }
    static int area(float d)
    {
        double k=(float)(3.14*d*d);
        return (int)k;
    }
}
