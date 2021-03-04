package edabit.veryhard;

import java.math.BigInteger;

//    If there are any non-numerical characters, return "-1".
//    An empty parameter should be treated as "0".
//    Your function should be able to add any size number.
//    Your function doesn't have to add negative numbers.
//    Zeros at the beginning of the string should be trimmed.
//    Bonus: Don't use BigInteger or BigDecimal classes.
public class AddTwoStringNumbers {

    public static void main(String[] args) {
        System.out.println(addStrNums("001", "030"));
    }

    // credit algorithm to Andreas on stack overflow
    public static String addStrNums(String num1, String num2) {
        if (!num1.matches("^[0-9]+$|^$") || !num2.matches("^[0-9]+$|^$")) // regex for numbers or empty strings
            return "-1";

        int i = num1.length();
        int j = num2.length();
        int k = Math.max(i, j) + 1; // room for carryover
        char[] c = new char[k];
        for (int digit = 0; k > 0; digit /= 10) {
            if (i > 0)
                digit += num1.charAt(--i) - '0';
            if (j > 0)
                digit += num2.charAt(--j) - '0';
            c[--k] = (char) ('0' + digit % 10);
        }
        return new String(c, k, c.length - k).replaceFirst("^0+(?!$)", ""); // regex selects leading zeroes, unless the number is just zero.
    }
}
