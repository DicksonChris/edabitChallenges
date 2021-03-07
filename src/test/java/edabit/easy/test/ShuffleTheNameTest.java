package edabit.easy.test;

import edabit.easy.ShuffleTheName;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShuffleTheNameTest {

        @Test
        public void test1() {
            assertEquals("Trump Donald", ShuffleTheName.nameShuffle("Donald Trump"));
        }

        @Test
        public void test2() {
            assertEquals("O'Donnel Rosie", ShuffleTheName.nameShuffle("Rosie O'Donnel"));
        }

        @Test
        public void test3() {
            assertEquals("Butts Seymour", ShuffleTheName.nameShuffle("Seymour Butts"));
        }

        @Test
        public void test4() {
            assertEquals("Greene Ebony", ShuffleTheName.nameShuffle("Ebony Greene"));
        }

        @Test
        public void test5() {
            assertEquals("Kennedy Ken", ShuffleTheName.nameShuffle("Ken Kennedy"));
        }

        @Test
        public void test6() {
            assertEquals("Gonzalez Allison", ShuffleTheName.nameShuffle("Allison Gonzalez"));
        }

        @Test
        public void test7() {
            assertEquals("Frazier Albert", ShuffleTheName.nameShuffle("Albert Frazier"));
        }

        @Test
        public void test8() {
            assertEquals("Hopkins Eloise", ShuffleTheName.nameShuffle("Eloise Hopkins"));
        }

        @Test
        public void test9() {
            assertEquals("Welch Donnie", ShuffleTheName.nameShuffle("Donnie Welch"));
        }

        @Test
        public void test10() {
            assertEquals("Thomas Vernon", ShuffleTheName.nameShuffle("Vernon Thomas"));
        }
}