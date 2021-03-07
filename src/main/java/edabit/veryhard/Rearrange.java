package edabit.veryhard;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Given a sentence with numbers representing a word's location embedded within each word,
// return the sorted sentence.
// rearrange("birth6day, 5your An1 juic3e o4n Tesh7! oli2ve") -> "An olive juice on your birthday, Tesh!"
public class Rearrange {

    public static String rearrange(String s) {
        String[] strArr = s.split(" ");
        String[] resultArr = new String[strArr.length];
        for (String str : strArr) {
            int idx = new Scanner(str).useDelimiter("\\D+").nextInt() - 1;
            resultArr[idx] = str.replaceAll("[\\d]", "");
        }
        return String.join(" ", resultArr);
    }
}

// // edabit answer by user "Deep Xavier" using declarative style
//public static String rearrange(String s) {
//    return Stream.of(s.split(" "))
//                 .sorted(Comparator.comparing(String::new, (a, b) -> a.replaceAll("[^\\d]", "").compareTo(b.replaceAll("[^\\d]", ""))))
//                 .collect(Collectors.joining(" "))
//                 .replaceAll("[\\d]", "")
//                 .trim();
//}

// // First attempt, works but is bad
//    public static String rearrange(String s) {
//        String[] strArr = s.split(" ");
//        String[] resultArr = new String[strArr.length];
//        int idx = 0;
//        for (String str : strArr) {
//            List<Character> chList = str.chars()
//                                        .mapToObj(c -> (char) c)
//                                        .collect(Collectors.toList());
//
//            Iterator<Character> i = chList.listIterator();
//            while (i.hasNext()) {
//                Character ch = i.next();
//                if (Character.isDigit(ch)) {
//                    idx = Integer.parseInt(String.valueOf(ch)) - 1;
//                    i.remove();
//                    break;
//                }
//            }
//
//            resultArr[idx] = chList.stream()
//                                   .map(String::valueOf)
//                                   .collect(Collectors.joining());
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < resultArr.length; i++) {
//            String str = resultArr[i];
//            sb.append(str);
//            if (i < resultArr.length - 1) sb.append(" ");
//        }
//
//        return sb.toString();
//    }