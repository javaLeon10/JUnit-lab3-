import sun.awt.AppContext;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GradeBookTest4 {

    private GradeBook g7;

    @org.junit.Before
    public void setUp() throws Exception {
        var g1 = new GradeBook(5);
        g1.addScore(50);
        g1.addScore(75);
        assertEquals(125, g1.sum(), .0001);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        GradeBook g1 = null;
    }

    @org.junit.Test
    public void addScore() {
        var g2 = new GradeBook(5);
        g2.addScore(50);
        g2.addScore(75);
        System.out.println("This is our string: "+g2.toString());
        assertTrue(g2.toString().equals("50.0 75.0 "));
    }

    @org.junit.Test
    public void sum() {
    }

    @org.junit.Test
    public void minimum() {
        var g3 = new GradeBook(5);
        g3.addScore(50);
        g3.addScore(75);
        assertEquals(50, g3.minimum(), .001);
    }

    @org.junit.Test
    public void finalScore() {
    }

    @org.junit.Test
    public void getScoreSize() {
    }

    @org.junit.Test
    public void testToString() {
    }
}