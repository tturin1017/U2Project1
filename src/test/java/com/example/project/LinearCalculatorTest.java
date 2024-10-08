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
    void testPrintInfo1(){
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

    @Test
    void testPrintInfo2(){
        LinearCalculator c = new LinearCalculator("(2,1)","(4,-3)");
        String expectedOutput = "The two points are: (2,1)";
        expectedOutput += " and " + "(4,-3)";
        expectedOutput += "\nThe equation of the line between these points is: y=-2.0x+5.0";
        expectedOutput += "\nThe slope of this line is: -2.0";
        expectedOutput += "\nThe y-intercept of the line is: 5.0";
        expectedOutput += "\nThe distance between the two points is: 4.47";

        String studentOutput = "The two points are: (" + c.getX1() + "," + c.getY1() + ")";
        studentOutput += " and " + "(" + c.getX2() + "," + c.getY2() + ")";
        studentOutput += "\nThe equation of the line between these points is: " + c.equation();
        studentOutput += "\nThe slope of this line is: " + c.slope();
        studentOutput += "\nThe y-intercept of the line is: " + c.yInt();
        studentOutput += "\nThe distance between the two points is: " + c.distance();
     
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testPrintInfo3(){
        LinearCalculator c = new LinearCalculator("(0,0)","(0,4)");
        String expectedOutput = "The two points are: (0,0)";
        expectedOutput += " and " + "(0,4)";
        expectedOutput += "\nThe equation of the line between these points is: undefined";
        expectedOutput += "\nThe slope of this line is: -999.99";
        expectedOutput += "\nThe y-intercept of the line is: -999.99";
        expectedOutput += "\nThe distance between the two points is: 4.0";

        String studentOutput = "The two points are: (" + c.getX1() + "," + c.getY1() + ")";
        studentOutput += " and " + "(" + c.getX2() + "," + c.getY2() + ")";
        studentOutput += "\nThe equation of the line between these points is: " + c.equation();
        studentOutput += "\nThe slope of this line is: " + c.slope();
        studentOutput += "\nThe y-intercept of the line is: " + c.yInt();
        studentOutput += "\nThe distance between the two points is: " + c.distance();
     
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testPrintInfo4(){
        LinearCalculator c = new LinearCalculator("(-5,3)","(2,0)");
        String expectedOutput = "The two points are: (-5,3)";
        expectedOutput += " and " + "(2,0)";
        expectedOutput += "\nThe equation of the line between these points is: y=-0.43x+0.85";
        expectedOutput += "\nThe slope of this line is: -0.43";
        expectedOutput += "\nThe y-intercept of the line is: 0.85";
        expectedOutput += "\nThe distance between the two points is: 7.62";

        String studentOutput = "The two points are: (" + c.getX1() + "," + c.getY1() + ")";
        studentOutput += " and " + "(" + c.getX2() + "," + c.getY2() + ")";
        studentOutput += "\nThe equation of the line between these points is: " + c.equation();
        studentOutput += "\nThe slope of this line is: " + c.slope();
        studentOutput += "\nThe y-intercept of the line is: " + c.yInt();
        studentOutput += "\nThe distance between the two points is: " + c.distance();
     
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testPrintInfo5(){
        LinearCalculator c = new LinearCalculator("(-5,1)","(1,1)");
        String expectedOutput = "The two points are: (-5,1)";
        expectedOutput += " and " + "(1,1)";
        expectedOutput += "\nThe equation of the line between these points is: y=1.0";
        expectedOutput += "\nThe slope of this line is: 0.0";
        expectedOutput += "\nThe y-intercept of the line is: 1.0";
        expectedOutput += "\nThe distance between the two points is: 6.0";

        String studentOutput = "The two points are: (" + c.getX1() + "," + c.getY1() + ")";
        studentOutput += " and " + "(" + c.getX2() + "," + c.getY2() + ")";
        studentOutput += "\nThe equation of the line between these points is: " + c.equation();
        studentOutput += "\nThe slope of this line is: " + c.slope();
        studentOutput += "\nThe y-intercept of the line is: " + c.yInt();
        studentOutput += "\nThe distance between the two points is: " + c.distance();
     
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testPrintInfo6(){
        LinearCalculator c = new LinearCalculator("(10,5)","(6,-1)");
        String expectedOutput = "The two points are: (10,5)";
        expectedOutput += " and " + "(6,-1)";
        expectedOutput += "\nThe equation of the line between these points is: y=1.5x-10.0";
        expectedOutput += "\nThe slope of this line is: 1.5";
        expectedOutput += "\nThe y-intercept of the line is: -10.0";
        expectedOutput += "\nThe distance between the two points is: 7.21";

        String studentOutput = "The two points are: (" + c.getX1() + "," + c.getY1() + ")";
        studentOutput += " and " + "(" + c.getX2() + "," + c.getY2() + ")";
        studentOutput += "\nThe equation of the line between these points is: " + c.equation();
        studentOutput += "\nThe slope of this line is: " + c.slope();
        studentOutput += "\nThe y-intercept of the line is: " + c.yInt();
        studentOutput += "\nThe distance between the two points is: " + c.distance();
     
        assertEquals(expectedOutput,studentOutput);
    }

    
}
