package edabit.hard;

// Write a function that returns True if, for each pair of consecutive strings,
// the second string can be formed from the first by adding a single letter either at the beginning or end.
// Return False a word is NOT formed by adding only one letter.
// Return False if the letter is added to the middle of the previous word.
// Letters in tests will all be lower case.
public class BuildingUpAWord {
    public static boolean canBuild(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            if ((arr[i + 1].length() - arr[i].length() != 1) || !arr[i + 1].contains(arr[i]))
                return false;
        return true;
    }
}