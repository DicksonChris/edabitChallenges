package edabit.easy.test;

import edabit.easy.IsTheWordAnIsogram;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsTheWordAnIsogramTest {
    @Test
    public void test1() {
        assertTrue(IsTheWordAnIsogram.isIsogram("Algorism"));
    }

    @Test
    public void test2() {
        assertFalse(IsTheWordAnIsogram.isIsogram("PasSword"));
    }

    @Test
    public void test3() {
        assertTrue(IsTheWordAnIsogram.isIsogram("Dermatoglyphics"));
    }

    @Test
    public void test4() {
        assertTrue(IsTheWordAnIsogram.isIsogram("Cat"));
    }

    @Test
    public void test5() {
        assertTrue(IsTheWordAnIsogram.isIsogram("Filmography"));
    }

    @Test
    public void test6() {
        assertFalse(IsTheWordAnIsogram.isIsogram("Consecutive"));
    }

    @Test
    public void test7() {
        assertTrue(IsTheWordAnIsogram.isIsogram("Bankruptcies"));
    }

    @Test
    public void test8() {
        assertTrue(IsTheWordAnIsogram.isIsogram("Unforgivable"));
    }

    @Test
    public void test9() {
        assertTrue(IsTheWordAnIsogram.isIsogram("Unpredictably"));
    }

    @Test
    public void test10() {
        assertFalse(IsTheWordAnIsogram.isIsogram("Moose"));
    }
}