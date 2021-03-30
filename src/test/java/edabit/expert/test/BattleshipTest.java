//package edabit.expert.test;
//
//import static org.junit.Assert.assertArrayEquals;
//import static org.junit.Assert.assertEquals;
//
//import edabit.expert.battleship.Battleship;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.JUnit4;
//
//
//@RunWith(JUnit4.class)
//public class BattleshipTest {
//    @Test
//    public void test01() {
//        Battleship battleship = new Battleship(new String[] {"A1", "C1", "B2", "B3", "D2", "E2", "E4", "E5", "A5"}, new String[] {"A1", "B2", "C3", "D4", "E5", "E4"});
//        assertArrayEquals(new String[][] {
//                {"☀", "○", "○", "○", "●"},
//                {"○", "☀", "●", "○", "○"},
//                {"●", "○", "☼", "○", "○"},
//                {"○", "●", "○", "☼", "○"},
//                {"○", "●", "○", "☀", "☀"}}, battleship.board());
//        assertEquals(4, battleship.hits());
//        assertEquals(1, battleship.sunk());
//        assertEquals(6, battleship.points());
//        battleship = null;
//    }
//
//    @Test
//    public void test02() {
//        Battleship battleship = new Battleship(new String[] {"A1", "C1", "B2", "B3", "D2", "E2", "E4", "E5", "A5"}, new String[] {"A2", "B4", "C1", "D3", "E5", "A5"});
//        assertArrayEquals(new String[][] {
//                {"●", "☼", "○", "○", "☀"},
//                {"○", "●", "●", "☼", "○"},
//                {"☀", "○", "○", "○", "○"},
//                {"○", "●", "☼", "○", "○"},
//                {"○", "●", "○", "●", "☀"}}, battleship.board());
//        assertEquals(3, battleship.hits());
//        assertEquals(0, battleship.sunk());
//        assertEquals(3, battleship.points());
//        battleship = null;
//    }
//
//    @Test
//    public void test03() {
//        Battleship battleship = new Battleship(new String[] {"A1", "C1", "B2", "B3", "D2", "E2", "E4", "E5", "A5"}, new String[] {"A1", "B1", "D1", "E1", "A3", "A4"});
//        assertArrayEquals(new String[][] {
//                {"☀", "○", "☼", "☼", "●"},
//                {"☼", "●", "●", "○", "○"},
//                {"●", "○", "○", "○", "○"},
//                {"☼", "●", "○", "○", "○"},
//                {"☼", "●", "○", "●", "●"}}, battleship.board());
//        assertEquals(1, battleship.hits());
//        assertEquals(0, battleship.sunk());
//        assertEquals(1, battleship.points());
//        battleship = null;
//    }
//
//    @Test
//    public void test04() {
//        Battleship battleship = new Battleship(new String[] {"A1", "B1", "D1", "E1", "A3", "A4", "D3", "E4", "D5"}, new String[] {"A1", "B2", "C3", "D4", "E5", "E4"});
//        assertArrayEquals(new String[][] {
//                {"☀", "○", "●", "●", "○"},
//                {"●", "☼", "○", "○", "○"},
//                {"○", "○", "☼", "○", "○"},
//                {"●", "○", "●", "☼", "●"},
//                {"●", "○", "○", "☀", "☼"}}, battleship.board());
//        assertEquals(2, battleship.hits());
//        assertEquals(0, battleship.sunk());
//        assertEquals(2, battleship.points());
//        battleship = null;
//    }
//
//    @Test
//    public void test05() {
//        Battleship battleship = new Battleship(new String[] {"A1", "B1", "D1", "E1", "A3", "A4", "D3", "E4", "D5"}, new String[] {"A2", "B4", "C1", "D3", "E5", "A5"});
//        assertArrayEquals(new String[][] {
//                {"●", "☼", "●", "●", "☼"},
//                {"●", "○", "○", "☼", "○"},
//                {"☼", "○", "○", "○", "○"},
//                {"●", "○", "☀", "○", "●"},
//                {"●", "○", "○", "●", "☼"}}, battleship.board());
//        assertEquals(1, battleship.hits());
//        assertEquals(0, battleship.sunk());
//        assertEquals(1, battleship.points());
//        battleship = null;
//    }
//
//    @Test
//    public void test06() {
//        Battleship battleship = new Battleship(new String[] {"A1", "B1", "D1", "E1", "A3", "A4", "D3", "E4", "D5"}, new String[] {"A1", "B1", "D1", "E1", "A3", "A4"});
//        assertArrayEquals(new String[][] {
//                {"☀", "○", "☀", "☀", "○"},
//                {"☀", "○", "○", "○", "○"},
//                {"○", "○", "○", "○", "○"},
//                {"☀", "○", "●", "○", "●"},
//                {"☀", "○", "○", "●", "○"}}, battleship.board());
//        assertEquals(6, battleship.hits());
//        assertEquals(3, battleship.sunk());
//        assertEquals(12, battleship.points());
//        battleship = null;
//    }
//
//    @Test
//    public void test07() {
//        Battleship battleship = new Battleship(new String[] {"A2", "A4", "C1", "C2", "E3", "C4", "C5", "D3", "E5"}, new String[] {"A1", "B2", "C3", "D4", "E5", "E4"});
//        assertArrayEquals(new String[][] {
//                {"☼", "●", "○", "●", "○"},
//                {"○", "☼", "○", "○", "○"},
//                {"●", "●", "☼", "●", "●"},
//                {"○", "○", "●", "☼", "○"},
//                {"○", "○", "●", "☼", "☀"}}, battleship.board());
//        assertEquals(1, battleship.hits());
//        assertEquals(0, battleship.sunk());
//        assertEquals(1, battleship.points());
//        battleship = null;
//    }
//
//    @Test
//    public void test08() {
//        Battleship battleship = new Battleship(new String[] {"A2", "A4", "C1", "C2", "E3", "C4", "C5", "D3", "E5"}, new String[] {"A2", "B4", "C1", "D3", "E5", "A5"});
//        assertArrayEquals(new String[][] {
//                {"○", "☀", "○", "●", "☼"},
//                {"○", "○", "○", "☼", "○"},
//                {"☀", "●", "○", "●", "●"},
//                {"○", "○", "☀", "○", "○"},
//                {"○", "○", "●", "○", "☀"}}, battleship.board());
//        assertEquals(4, battleship.hits());
//        assertEquals(0, battleship.sunk());
//        assertEquals(4, battleship.points());
//        battleship = null;
//    }
//
//    @Test
//    public void test09() {
//        Battleship battleship = new Battleship(new String[] {"A2", "A4", "C1", "C2", "E3", "C4", "C5", "D3", "E5"}, new String[] {"A1", "B1", "D1", "E1", "A3", "A4"});
//        assertArrayEquals(new String[][] {
//                {"☼", "●", "☼", "☀", "○"},
//                {"☼", "○", "○", "○", "○"},
//                {"●", "●", "○", "●", "●"},
//                {"☼", "○", "●", "○", "○"},
//                {"☼", "○", "●", "○", "●"}}, battleship.board());
//        assertEquals(1, battleship.hits());
//        assertEquals(0, battleship.sunk());
//        assertEquals(1, battleship.points());
//        battleship = null;
//    }
//}
////end of tests