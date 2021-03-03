package edabit.medium;

import java.util.Arrays;

// Create a function that takes a string and returns true or false,
// depending on whether the characters are in order or not.
public class IsTheStringInOrder {
    public static boolean isInOrder(String str){
        char[] charArray = (str).toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray).equals(str);
    }
}
