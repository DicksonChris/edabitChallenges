package edabit.medium;

import java.util.Arrays;

// Create a function that takes an integer and
// outputs an n x n square solely consisting of the integer n.
// n is greater than or equal to 0. If n is equal to 0, return an empty array.
public class PerfectSquarePatch {
    public static int[][] squarePatch(int n) {
        int[][] arr = new int[n][n];
        for (int[] row : arr)
            Arrays.fill(row, n);
        return arr;
    }
}
