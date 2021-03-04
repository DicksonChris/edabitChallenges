package edabit.veryhard.test;

import edabit.veryhard.SameLetterPatterns;
import org.junit.Test;

import static org.junit.Assert.*;

public class SameLetterPatternsTest {
    @Test
    public void test1() {
        assertTrue(SameLetterPatterns.sameLetterPattern("ABAB", "CDCD"));
    }

    @Test
    public void test2() {
        assertTrue(SameLetterPatterns.sameLetterPattern("AAABBB", "CCCDDD"));
    }

    @Test
    public void test3() {
        assertTrue(SameLetterPatterns.sameLetterPattern("ABCBA", "BCDCB"));
    }

    @Test
    public void test4() {
        assertTrue(SameLetterPatterns.sameLetterPattern("AAAA", "BBBB"));
    }

    @Test
    public void test5() {
        assertTrue(SameLetterPatterns.sameLetterPattern("BAAB", "ABBA"));
    }

    @Test
    public void test6() {
        assertTrue(SameLetterPatterns.sameLetterPattern("BAAB", "QZZQ"));
    }

    @Test
    public void test7() {
        assertTrue(SameLetterPatterns.sameLetterPattern("TTZZVV", "PPSSBB"));
    }

    @Test
    public void test8() {
        assertTrue(SameLetterPatterns.sameLetterPattern("ZYX", "ABC"));
    }

    @Test
    public void test9() {
        assertTrue(SameLetterPatterns.sameLetterPattern("AABAA", "SSCSS"));
    }

    @Test
    public void test10() {
        assertTrue(SameLetterPatterns.sameLetterPattern("AABAABAA", "SSCSSCSS"));
    }

    @Test
    public void test11() {
        assertTrue(SameLetterPatterns.sameLetterPattern("UBUBUBUB", "WEWEWEWE"));
    }

    @Test
    public void test12() {
        assertFalse(SameLetterPatterns.sameLetterPattern("FFGG", "FFG"));
    }

    @Test
    public void test13() {
        assertFalse(SameLetterPatterns.sameLetterPattern("FFGG", "CDCD"));
    }

    @Test
    public void test14() {
        assertFalse(SameLetterPatterns.sameLetterPattern("FFFG", "GGHI"));
    }

    @Test
    public void test15() {
        assertFalse(SameLetterPatterns.sameLetterPattern("FFFF", "ABCD"));
    }

    @Test
    public void test16() {
        assertFalse(SameLetterPatterns.sameLetterPattern("ABCA", "ABCD"));
    }

    @Test
    public void test17() {
        assertFalse(SameLetterPatterns.sameLetterPattern("ABCAAA", "DDABCD"));
    }
}