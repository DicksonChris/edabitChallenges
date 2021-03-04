package edabit.medium;

/*
 Create a function that takes an array of integers,
 sums the even and odd numbers separately,
 then returns the difference between sum of even and odd numbers.
*/
public class WarOfNumbers {
    public static int warOfNumbers(int[] numbers) {
        int even = 0;
        int odd = 0;
        for (int num : numbers)
            if (num % 2 == 0)
                even += num;
            else odd += num;
        return Math.abs(even - odd);
    }
}
