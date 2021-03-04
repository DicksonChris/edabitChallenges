package edabit.hard;

import java.util.Arrays;

/* Create a function that takes an array of numbers and return "Boom!"
if the digit 7 appears in the array. Otherwise, return "there is no 7 in the array". */
public class SevenBoom {
    public static String sevenBoom(int[] arr) {
        return Arrays.toString(arr)
                     .contains("7") ? "Boom!" : "there is no 7 in the array";
    }
}