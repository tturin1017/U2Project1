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

    @Test
    void testSetX2(){
        LinearCalculator c = new LinearCalculator("(0,1)", "(2,3)");
        int expectedOutput = -9;
        c.setX2(-9);
        int studentOutput = c.getX2();
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testSetY2(){
        LinearCalculator c = new LinearCalculator("(0,1)", "(2,3)");
        int expectedOutput = -9;
        c.setY2(-9);
        int studentOutput = c.getY2();
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testDistance(){
        LinearCalculator c = new LinearCalculator("(-3,-1)","(4,-3)");
        double expectedOutput = 7.28;
        double studentOutput = c.distance();
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testYint(){
        LinearCalculator c = new LinearCalculator("(-3,-1)","(4,-3)");
        double expectedOutput = -1.87;
        double studentOutput = c.yInt();
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testSlope(){
        LinearCalculator c = new LinearCalculator("(-3,-1)","(4,-3)");
        double expectedOutput = -0.29;
        double studentOutput = c.slope();
        assertEquals(expectedOutput,studentOutput);   
    }

    @Test
    void testPrintInfo(){
        LinearCalculator c = new LinearCalculator("(0,0)","(5,68)");
        String expectedOutput = "The two points are: (0,0)";
        expectedOutput += " and " + "(5,68)";
        expectedOutput += "\nThe equation of the line between these points is: y=13.6x";
        expectedOutput += "\nThe slope of this line is: 13.6";
        expectedOutput += "\nThe y-intercept of the line is: 0.0";
        expectedOutput += "\nThe distance between the two points is: 68.18";



        String studentOutput = "The two points are: (" + c.getX1() + "," + c.getY1() + ")";
        studentOutput += " and " + "(" + c.getX2() + "," + c.getY2() + ")";
        studentOutput += "\nThe equation of the line between these points is: " + c.equation();
        studentOutput += "\nThe slope of this line is: " + c.slope();
        studentOutput += "\nThe y-intercept of the line is: " + c.yInt();
        studentOutput += "\nThe distance between the two points is: " + c.distance();
     

        assertEquals(expectedOutput,studentOutput);
    }

    
}
