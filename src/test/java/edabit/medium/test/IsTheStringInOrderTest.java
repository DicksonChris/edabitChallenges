package edabit.medium.test;

import edabit.medium.IsTheStringInOrder;
import org.junit.Test;

import static org.junit.Assert.*;


public class IsTheStringInOrderTest {
    @Test
    public void test1() {
        assertTrue(IsTheStringInOrder.isInOrder("abc"));
    }

    @Test
    public void test2() {
        assertFalse(IsTheStringInOrder.isInOrder("edabit"));
    }

    @Test
    public void test3() {
        assertTrue(IsTheStringInOrder.isInOrder("xyz"));
    }

    @Test
    public void test4() {
        assertTrue(IsTheStringInOrder.isInOrder("xyzz"));
    }

    @Test
    public void test5() {
        assertTrue(IsTheStringInOrder.isInOrder("123"));
    }

    @Test
    public void test6() {
        assertFalse(IsTheStringInOrder.isInOrder("321"));
    }
}
