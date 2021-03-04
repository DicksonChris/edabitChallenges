package edabit.medium;

import java.util.Arrays;

// Given an array of cities and populations,
// return an array where all populations are rounded to the nearest million.
// Round down to 0 if a population is below 500,000.
public class RoundInMillions {
    public static Object[] millionsRounding(Object[] cities) {
        for (int i = 0; i < cities.length; i++) {
            Object[] city = (Object[]) cities[i];
            // city[0] is the name, city[1] is the population
            city[1] = ((int) city[1] < 5e5)
                    ? 0 // Less than 500K round to 0
                    : roundToNearestMillion(city[1]);
            cities[i] = new Object[]{city[0], city[1]};
        }
        return cities;
    }

    private static int roundToNearestMillion(Object pop) {
        return (int) (Math.round((int) pop / 1e6) * 1e6);
    }
}