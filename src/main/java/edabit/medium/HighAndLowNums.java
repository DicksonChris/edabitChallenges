package edabit.medium;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

// Create a method that accepts a string of space separated numbers
// returns the highest and lowest number (as a string).
// highLow("1 2 3 4 5") ➞ "5 1"
// * All numbers are valid Int32, no need to validate them.
// * There will always be at least one number in the input string.
// * Output string must be two numbers separated by a single space, and highest number is first.
public class HighAndLowNums {
    public static String highLow(String s) {
        int[] nums = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int e : nums) {
            min = Math.min(e, min);
            max = Math.max(e, max);
        }
        return String.format("%d %d", max, min);
    }

    public static void main(String[] args) {
        System.out.println(highLow("2 4 6 8"));
    }
}