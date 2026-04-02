java
package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    App student = new App();

    @Test
    public void testCalculateAverage() {
        assertEquals(85.0, student.calculateAverage(85, 90, 80), 0.01);
    }

    @Test
    public void testGradeA() {
        assertEquals("A", student.calculateGrade(95));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", student.calculateGrade(80));
    }

    @Test
    public void testGradeC() {
        assertEquals("C", student.calculateGrade(65));
    }

    @Test
    public void testGradeD() {
        assertEquals("D", student.calculateGrade(45));
    }

    @Test
    public void testGradeF() {
        assertEquals("F", student.calculateGrade(30));
    }
}
