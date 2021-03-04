package edabit.veryhard.nearest.chapter;

import java.util.Arrays;

// Create a function that returns which chapter is nearest to the page you're on.
// If two chapters are equidistant, return the chapter with the higher page number.
public class NearestChapter {
    public static String nearestChapter(Chapter[] chapter, int page) {
        return Arrays.stream(chapter)
                     .reduce(new Chapter("", -1), (Chapter a, Chapter b) ->
                         Math.abs(a.getPage() - page) < Math.abs(b.getPage() - page)
                                 ? a // Chapter A is closer to page
                                 : b // Chapter B is closer or is equidistant and has a higher page number
                     ).getName();
    }
}

