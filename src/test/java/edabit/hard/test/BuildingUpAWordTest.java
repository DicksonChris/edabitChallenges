package edabit.hard.test;

import edabit.hard.BuildingUpAWord;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BuildingUpAWordTest {
    @Test
    public void test1() {
        assertTrue(BuildingUpAWord.canBuild(new String[]{"a", "at", "ate", "late", "plate", "plates"}));
    }

    @Test
    public void test2() {
        assertTrue(BuildingUpAWord.canBuild(new String[]{"u", "ut", "but", "butt", "butte", "butter", "buttery"}));
    }

    @Test
    public void test3() {
        assertTrue(BuildingUpAWord.canBuild(new String[]{"a", "ka", "ika", "pika", "pikac", "pikach", "pikachu"}));
    }

    @Test
    public void test4() {
        assertTrue(BuildingUpAWord.canBuild(new String[]{"a", "at", "tat", "stat", "state", "estate", "estates"}));
    }

    @Test
    public void test5() {
        assertTrue(BuildingUpAWord.canBuild(new String[]{"o", "ol", "old", "bold", "bolde", "mbolde", "embolde", "embolden"}));
    }

    @Test
    public void test6() {
        assertTrue(BuildingUpAWord.canBuild(new String[]{"mean", "meany"}));
    }

    @Test
    public void test7() {
        assertTrue(BuildingUpAWord.canBuild(new String[]{"at", "cat", "cate", "cater", "caters"}));
    }

    @Test
    public void test8() {
        assertFalse(BuildingUpAWord.canBuild(new String[]{"a", "at", "ate", "late", "plate", "plater", "platter"}));
    }

    @Test
    public void test9() {
        assertFalse(BuildingUpAWord.canBuild(new String[]{"i", "it", "bit", "bite", "biters"}));
    }

    @Test
    public void test10() {
        assertFalse(BuildingUpAWord.canBuild(new String[]{"e", "tea", "teac", "teach", "teache", "teacher", "teachers"}));
    }

    @Test
    public void test11() {
        assertFalse(BuildingUpAWord.canBuild(new String[]{"m", "ma", "man", "many", "meany"}));
    }

    @Test
    public void test12() {
        assertFalse(BuildingUpAWord.canBuild(new String[]{"o", "op", "top", "stop", "stops", "stoops"}));
    }

    @Test
    public void test13() {
        assertFalse(BuildingUpAWord.canBuild(new String[]{"air", "air", "airy", "fairy"}));
    }

    @Test
    public void test14() {
        assertFalse(BuildingUpAWord.canBuild(new String[]{"men", "mean", "meany"}));
    }
}