package edabit.hard.test;

import edabit.hard.FindTheOddInteger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheOddIntegerTest {
    @Test
    public void test1() {
        assertEquals(FindTheOddInteger.findOdd(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}), 5);
    }

    @Test
    public void test2() {
        assertEquals(FindTheOddInteger.findOdd(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}), -1);
    }

    @Test
    public void test3() {
        assertEquals(FindTheOddInteger.findOdd(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}), 5);
    }

    @Test
    public void test4() {
        assertEquals(FindTheOddInteger.findOdd(new int[]{10}), 10);
    }

    @Test
    public void test5() {
        assertEquals(FindTheOddInteger.findOdd(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}), 10);
    }

    @Test
    public void test6() {
        assertEquals(FindTheOddInteger.findOdd(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10}), 1);
    }
}