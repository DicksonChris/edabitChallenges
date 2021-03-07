package edabit.easy;

// Create a method that accepts a string (of a person's first and last name)
// and returns a string with the first and last name swapped.
// nameShuffle("Seymour Butts") ➞ "Butts Seymour"
// There will be exactly one space between the first and last name.
// If you get stuck on a challenge, find help in the Resources tab.
// If you're really stuck, unlock solutions in the Solutions tab.
public class ShuffleTheName {
    public static String nameShuffle(String s) {
        String[] names = s.split(" ");
        return names[1] + " " + names[0];
    }
}