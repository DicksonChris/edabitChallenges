package edabit.hard;

import java.util.*;
import java.util.stream.Collectors;

// Create a function that takes an array and finds the integer which appears an odd number of times.
// There will always only be one integer that appears an odd number of times.
public class FindTheOddInteger {
    // More performant
    public static int findOdd(int[] arr) {
        ArrayList<Integer> odds = new ArrayList<>();

        for (int e : arr) {
            if (odds.contains(e))
                odds.remove((Integer) e);
            else odds.add(e);
        }
        return odds.get(0);
    }
}
// // Using declarative style
//    public static int findOdd(int[] arr) {
//        HashMap<Integer, Integer> counts = new HashMap<>();
//        for (int e : arr) counts.merge(e, 1, Integer::sum);
//        return counts.entrySet()
//                     .stream()
//                     .filter(e -> e.getValue() % 2 != 0)
//                     .findFirst()
//                     .map(Map.Entry::getKey).orElse(-1);
//}

// // Using imperative style
//    public static int findOdd(int[] arr) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int e : arr)
//            map.merge(e, 1, Integer::sum);
//
//        int odd = 0;
//        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
//            if (e.getValue() % 2 != 0) {
//                odd = e.getKey();
//                break;
//            }
//        }
//        return odd;
//    }