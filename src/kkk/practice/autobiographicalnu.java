package kkk.practice;
import java.util.*;

public class autobiographicalnu {
    public static void main(String[] args) {
        String numberStr = "1210"; // You can change this string to test different cases

        if (isAutobiographic(numberStr)) {
            System.out.println("Distinct numbers in the autobiographic number: " + countDistinctDigits(numberStr));
        } else {
            System.out.println("0");
        }
    }

    // Function to check if a number is autobiographic
    public static boolean isAutobiographic(String numberStr) {
        int length = numberStr.length();

        int[] digitCounts = new int[length];

        // Count occurrences of each digit in the number
        for (char c : numberStr.toCharArray()) {
            int digit = Character.getNumericValue(c);
            if (digit < length) {
                digitCounts[digit]++;
            } else {
                return false; // If digit is out of range
            }
        }

        // Check if the digit counts match the number's digits
        for (int i = 0; i < length; i++) {
            if (digitCounts[i] != Character.getNumericValue(numberStr.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    // Function to count distinct digits in the number
    public static int countDistinctDigits(String numberStr) {
        HashSet<Character> distinctDigits = new HashSet<>();

        for (char c : numberStr.toCharArray()) {
            distinctDigits.add(c);
        }

        return distinctDigits.size();
    }
}
