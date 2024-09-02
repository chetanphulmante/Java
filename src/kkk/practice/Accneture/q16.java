package kkk.practice.Accneture;

public class q16 {
    public static void main(String[] args) {
        System.out.println(solve(100, 4, 105, 80, 10));
    }

    static int solve(int m, int n, int input1, int input2, int input3) {
        int count = 0;
        while (input1 > 0) {


            // Edge case handling and recursion
            if (input1 <= 0) {
                return 0;  // If no customers are left, no more calories are burned
            }

            if (input1 <= n) {
                // If remaining customers can be handled by machine with power n
                count += input3;
                input1 -= n;
                return count;
            }

            int maxPeopleHandledByM = m;
            int maxPeopleHandledByN = (input2 / input3) * n;

            if (maxPeopleHandledByN <= maxPeopleHandledByM && input1 >= maxPeopleHandledByM) {
                // Use machine M if it can handle more or equal customers and still some left
                count += input2;
                input1 = input1 - maxPeopleHandledByM;
//            return count + solve(m, n, input1 - maxPeopleHandledByM, input2, input3);
            } else {
                // Use machine N for smaller batch or inefficient handling
                count += input3;
                input1 = input1 - n;
//            return count + solve(m, n, input1 - n, input2, input3);
            }
        }
        return count;
    }
}
