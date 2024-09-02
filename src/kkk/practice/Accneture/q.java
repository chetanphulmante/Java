package kkk.practice.Accneture;
import java.util.Arrays;

public class q {
    public static void main(String[] args) {
        int customer = 105;
        int powerOfMachineOne = 10;
        int powerOfMachineTwo = 80;
        int[] dp = new int[customer + 1];
        Arrays.fill(dp, -1);
        System.out.println(solve(customer, powerOfMachineOne, powerOfMachineTwo, dp));
    }

    static int solve(int customer, int power1, int power2, int[] dp) {
        if (customer <= 0) {
            return 0;
        }
        if (dp[customer] != -1) {
            return dp[customer];
        }
        int option1 = solve(customer - 4, power1, power2, dp);
        int option2 = solve(customer - 100, power1, power2, dp);
        dp[customer] = Math.min(option1 + power1, option2 + power2);
        return dp[customer];
    }
}
