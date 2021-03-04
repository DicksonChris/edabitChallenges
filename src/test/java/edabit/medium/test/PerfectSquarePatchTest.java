package edabit.medium.test;

import edabit.medium.PerfectSquarePatch;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PerfectSquarePatchTest {
    @Test
    public void test1() {
        assertTrue(Arrays.deepEquals(PerfectSquarePatch.squarePatch(3), new int[][]{
                {3, 3, 3},
                {3, 3, 3},
                {3, 3, 3}
        }));
    }

    @Test
    public void test2() {
        assertTrue(Arrays.deepEquals(PerfectSquarePatch.squarePatch(2), new int[][] {
                {2, 2},
                {2, 2}
        }));
    }

    @Test
    public void test3() {
        assertTrue(Arrays.deepEquals(PerfectSquarePatch.squarePatch(4), new int[][] {
                {4, 4, 4, 4},
                {4, 4, 4, 4},
                {4, 4, 4, 4},
                {4, 4, 4, 4}
        }));
    }

    @Test
    public void test4() {
        assertTrue(Arrays.deepEquals(PerfectSquarePatch.squarePatch(6), new int[][] {
                {6, 6, 6, 6, 6, 6},
                {6, 6, 6, 6, 6, 6},
                {6, 6, 6, 6, 6, 6},
                {6, 6, 6, 6, 6, 6},
                {6, 6, 6, 6, 6, 6},
                {6, 6, 6, 6, 6, 6}
        }));
    }

    @Test
    public void test5() {
        assertTrue(Arrays.deepEquals(PerfectSquarePatch.squarePatch(5), new int[][] {
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5}
        }));
    }

    @Test
    public void test6() {
        assertTrue(Arrays.deepEquals(PerfectSquarePatch.squarePatch(1), new int[][]{{1}}));
    }

    @Test
    public void test7() {
        assertTrue(Arrays.deepEquals(PerfectSquarePatch.squarePatch(0), new int[][]{}));
    }
}