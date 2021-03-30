package edabit.medium.test;

import edabit.medium.HighAndLowNums;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HighAndLowNumsTest {
    @Test
    public void test1() {
        Assert.assertEquals("542 -214", HighAndLowNums.highLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"));
    }

    @Test
    public void test2() {
        assertEquals("1 -1", HighAndLowNums.highLow("1 -1"));
    }

    @Test
    public void test3() {
        assertEquals("1 1", HighAndLowNums.highLow("1 1"));
    }

    @Test
    public void test4() {
        assertEquals("-1 -1", HighAndLowNums.highLow("-1 -1"));
    }

    @Test
    public void test5() {
        assertEquals("1 -1", HighAndLowNums.highLow("1 -1 0"));
    }

    @Test
    public void test6() {
        assertEquals("1 0", HighAndLowNums.highLow("1 1 0"));
    }

    @Test
    public void test7() {
        assertEquals("0 -1", HighAndLowNums.highLow("-1 -1 0"));
    }

    @Test
    public void test8() {
        assertEquals("42 42", HighAndLowNums.highLow("42"));
    }
}