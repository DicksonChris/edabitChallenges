package edabit.easy;

import java.util.Arrays;
import java.util.Arrays.*;
import java.util.HashSet;
import java.util.Set;

// An isogram is a word that has no duplicate letters.
// Create a function that takes a string and returns either true or false depending on whether or not it's an "isogram".
public class IsTheWordAnIsogram {
    public static void main(String[] args) {
        System.out.println(isIsogram("Algorism"));
    }
    public static boolean isIsogram(String str) {
        str = str.toLowerCase();
        char[] charCopyArr = str.toCharArray();
        char[] strCharArr = str.toCharArray();
        int counter = 0;
        for (int i = 0; i < strCharArr.length; i++) {
            char a = strCharArr[i];
            for (int j = 0; j < charCopyArr.length; j++) {
                char b = charCopyArr[j];
                if (a == b) {
                    counter++;
                    if (counter > 1) {
                        System.out.println(counter);
                        return false;
                    }
                }
            }
            counter = 0;
        }
        return true;
    }
}