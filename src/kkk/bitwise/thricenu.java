package kkk.bitwise;

public class thricenu {
    public static void main(String[] args) {
        int[] ar={2,2,5,2,4,1,3,5,1,3,1,3,5};
        System.out.println(findonceno(ar));
    }
    static int findonceno(int[] ar) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
//            ans = 0;
            int x = 1 << i;
            for (int k : ar) {
                if ((k & x) != 0) {
                    sum++;
                }
            }
            if ((sum % 3) != 0) {
                ans |= x;
            }

        }
        return ans;
    }
}
