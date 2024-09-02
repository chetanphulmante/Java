package kkk.practice;

// Java code to implement the approach

import java.io.*;

public class gfg {

    // Function to return area of intersection
    static double intersectionArea(int X1, int Y1, int R1,
                                int X2, int Y2, int R2)
    {
        double Pi = 3.14;
        double d, alpha, beta, a1, a2;
        double ans;

        // Calculate the euclidean distance
        // between the two points
        d = Math.sqrt((X2 - X1) * (X2 - X1)
                + (Y2 - Y1) * (Y2 - Y1));

        if (d > R1 + R2)
            ans = 0;

        else if (d <= (R1 - R2) && R1 >= R2)
            ans = (int)Math.floor(Pi * (double)R2
                    * (double)R2);

        else if (d <= (R2 - R1) && R2 >= R1)
            ans = (int)Math.floor(Pi * (double)R1
                    * (double)R1);

        else {
            alpha = Math.acos((R1 * R1 + d * d - R2 * R2)
                    / (2 * R1 * d))
                    * 2;
            beta = Math.acos((R2 * R2 + d * d - R1 * R1)
                    / (2 * R2 * d))
                    * 2;
            a1 = 0.5 * beta * R2 * R2
                    - 0.5 * R2 * R2 * Math.sin(beta);
            a2 = 0.5 * alpha * R1 * R1
                    - 0.5 * R1 * R1 * Math.sin(alpha);
            ans = (int)Math.floor(a1 + a2);
        }

        return ans;
    }

    public static void main(String[] args)
    {
        int X1 = 0, Y1 = 0, R1 = 2;
        int X2 = 3, Y2 = 0, R2 = 2;

        // Function Call
        System.out.print(
                intersectionArea(X1, Y1, R1, X2, Y2, R2));
    }
}

// This code is contributed by lokeshmvs21.
