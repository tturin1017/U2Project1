package com.example.project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LinearCalculatorTest {

    @Test
    void testGetX1(){
        LinearCalculator c = new LinearCalculator("(0,1)", "(2,3)");
        int expectedOutput = 0;
        int studentOutput = c.getX1();
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testGetX2(){
        LinearCalculator c = new LinearCalculator("(0,1)", "(2,3)");
        int expectedOutput = 2;
        int studentOutput = c.getX2();
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testGetY1(){
        LinearCalculator c = new LinearCalculator("(0,1)", "(2,3)");
        int expectedOutput = 1;
        int studentOutput = c.getY1();
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testGetY2(){
        LinearCalculator c = new LinearCalculator("(0,1)", "(2,3)");
        int expectedOutput = 3;
        int studentOutput = c.getY2();
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testSetX1(){
        LinearCalculator c = new LinearCalculator("(0,1)", "(2,3)");
        int expectedOutput = -9;
        c.setX1(-9);
        int studentOutput = c.getX1();
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testSetY1(){
        LinearCalculator c = new LinearCalculator("(0,1)", "(2,3)");
        int expectedOutput = -9;
        c.setY1(-9);
        int studentOutput = c.getY1();
        assertEquals(expectedOutput,studentOutput);
    }
    
}
