package edabit.veryhard.test;

import edabit.veryhard.nearest.chapter.NearestChapter;
import edabit.veryhard.nearest.chapter.Chapter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NearestChapterTest {
    private final Chapter[][] chapterVector = new Chapter[][] {
            {new Chapter("Chapter 1", 1), new Chapter("Chapter 2", 15), new Chapter("Chapter 3", 37)},
            {new Chapter("New Beginnings", 1), new Chapter("Strange Developments", 62), new Chapter("The End?", 194), new Chapter("The True Ending", 460)},
            {new Chapter("Chapter 1a", 1), new Chapter("Chapter 1b", 5)},
            {new Chapter("Chapter 1a", 1), new Chapter("Chapter 1b", 5), new Chapter("Chapter 1c", 50), new Chapter("Chapter 1d", 100)},
            {new Chapter("Chapter 1a", 1), new Chapter("Chapter 1b", 5), new Chapter("Chapter 1c", 50), new Chapter("Chapter 1d", 100), new Chapter("Chapter 1e", 200)},
            {new Chapter("Chapter 1a", 1), new Chapter("Chapter 1b", 5), new Chapter("Chapter 1c", 50), new Chapter("Chapter 1d", 100), new Chapter("Chapter 1e", 200)},
            {new Chapter("Chapter 1a", 1), new Chapter("Chapter 1b", 5), new Chapter("Chapter 1c", 50), new Chapter("Chapter 1d", 100), new Chapter("Chapter 1e", 200), new Chapter("Chapter 1f", 400)}
    };
    private final int[] pageVector = new int[] {10, 200, 3, 75, 150, 74, 300};
    private final String[] resVector = new String[] {
            "Chapter 2", "The End?", "Chapter 1b", "Chapter 1d", "Chapter 1e", "Chapter 1c", "Chapter 1f"
    };

    @Test
    public void test01() {
        assertEquals(NearestChapter.nearestChapter(chapterVector[0], pageVector[0]), resVector[0]);
    }

    @Test
    public void test02() {
        assertEquals(NearestChapter.nearestChapter(chapterVector[1], pageVector[1]), resVector[1]);
    }

    @Test
    public void test03() {
        assertEquals(NearestChapter.nearestChapter(chapterVector[2], pageVector[2]), resVector[2]);
    }

    @Test
    public void test04() {
        assertEquals(NearestChapter.nearestChapter(chapterVector[3], pageVector[3]), resVector[3]);
    }

    @Test
    public void test05() {
        assertEquals(NearestChapter.nearestChapter(chapterVector[4], pageVector[4]), resVector[4]);
    }

    @Test
    public void test06() {
        assertEquals(NearestChapter.nearestChapter(chapterVector[5], pageVector[5]), resVector[5]);
    }

    @Test
    public void test07() {
        assertEquals(NearestChapter.nearestChapter(chapterVector[6], pageVector[6]), resVector[6]);
    }
}