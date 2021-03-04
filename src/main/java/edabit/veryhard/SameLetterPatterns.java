package edabit.veryhard;

import java.util.*;
import java.util.stream.Collectors;

// Create a function that returns true if two strings share the same letter pattern, and false otherwise.
// "ABAB", "CDCD" ➞ true
// "ABCBA", "BCDCB" ➞ true
// "FFGG", "CDCD" ➞ false
// "FFFF", "ABCD" ➞ false
public class SameLetterPatterns {
    static List<Integer> encode(String str) {
        return str.chars()
                  .map(str::indexOf) // returns first occurrence of the char in the string
                  .boxed() // needed to prepare primitive char for toList
                  .collect(Collectors.toList());
    }
    public static boolean sameLetterPattern(String str1, String str2) {
        return encode(str1).equals(encode(str2));
    }














//    public static boolean sameLetterPattern(String str1, String str2) {
//        return getPattern(str1).equals(getPattern(str2));
//    }
//
//    private static List<Integer> getPattern(String str1) {
//        List<Integer> pattern = new ArrayList<>();
//        int value = 0;
//        HashMap<Character, Integer> valueRef = new HashMap<>();
//        for (int i = 0; i < str1.length(); i++) {
//            char key = str1.charAt(i); // chars become the key for the map
//            if (valueRef.containsKey(key)) {
//                pattern.add(valueRef.get(key)); // adds the value to the list from keys that have already been assigned
//            } else {
//                valueRef.put(key, value); // values are assigned for each key that hasn't been assigned yet
//                pattern.add(value); // adds the value to the list
//                value++; // increments value for next new key
//            }
//        }
//        return pattern;
//    }
}
