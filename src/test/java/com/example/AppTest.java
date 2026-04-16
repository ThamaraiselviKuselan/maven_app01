package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {

    App student = new App();

    @Test
    void testCalculateAverage() {
        assertEquals(85.0, student.calculateAverage(85, 90, 80), 0.01);
    }

    @Test
    void testGradeA() {
        assertEquals("A", student.calculateGrade(95));
    }

    @Test
    void testGradeB() {
        assertEquals("B", student.calculateGrade(80));
    }

    @Test
    void testGradeC() {
        assertEquals("C", student.calculateGrade(65));
    }

    @Test
    void testGradeD() {
        assertEquals("D", student.calculateGrade(45));
    }

    @Test
    void testGradeF() {
        assertEquals("F", student.calculateGrade(30));
    }
}