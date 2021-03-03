package edabit.medium;

public class RoundToMillions {
    public static Object[] millionsRounding(Object[] cities) {
        for (int i = 0; i < cities.length; i++) {
            Object[] k = (Object[])cities[i];
            k[1] = (int)k[1] < 5e5 ? 0 : (int)(Math.round((int)k[1]/1e6)*1e6);
            cities[i] = new Object[] { k[0], k[1] };}
        return cities;
    }
}