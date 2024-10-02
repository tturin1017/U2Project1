package com.example.project;
public class LinearCalculator{
    //INSTANCE VARIABLES 
    //4 integers variables (name them x1,x2,y1,y2) for the two pairs of coordinates
    private int x1, x2, y1, y2;

    //CONSTRUCTOR
    //1 constructor with 2 parameters of String type. Each paramter represents a coordinate. 
    //For example, "(1,2)" and "(3,4)" would be two parameter values 
    //You will have to parse the string into 4 integers, representing the 4 points
    public LinearCalculator(String c1, String c2){
        if(c1.substring(1,2).equals("-")){ 
            //(-x,+/y)
            x1 = Integer.parseInt(c1.substring(1,3));
            if(c1.substring(4,5).equals("-")){
                //(-x,-y)
                y1 = Integer.parseInt(c1.substring(4,6));
            }else{
                //(-x,y)
                y1 = Integer.parseInt(c1.substring(4,5));
            }
        }else{
            //(x,+/y)
            x1 = Integer.parseInt(c1.substring(1,2));
            if(c1.substring(3,4).equals("-")){
                //(x,-y)
                y1 = Integer.parseInt(c1.substring(3,5));
            }else{
                //(x,y)
                y1 = Integer.parseInt(c1.substring(3,4));
            }
        }
        System.out.println("hi");

        if(c2.substring(1,2).equals("-")){ 
            //(-x,+/y)
            x2 = Integer.parseInt(c2.substring(1,3));
            if(c2.substring(4,5).equals("-")){
                //(-x,-y)
                y2 = Integer.parseInt(c2.substring(4,6));
            }else{
                //(-x,y)
                y2 = Integer.parseInt(c2.substring(4,5));
            }
        }else{
            //(x,+/y)
            x2 = Integer.parseInt(c2.substring(1,2));
            if(c1.substring(3,4).equals("-")){
                //(x,-y)
                y2 = Integer.parseInt(c2.substring(3,5));
            }else{
                //(x,y)
                y2 = Integer.parseInt(c2.substring(3,4));
            }
        }


        

     
    }

    //METHOD SIGNATURES 

    //getters and setters for the 4 instance variables (8 methods total) 
    public int getX1(){return x1;}
    public int getY1(){return y1;}
    public int getX2(){return x2;}
    public int getY2(){return y2;}

    //distance() -> returns a double. 
    //calculates the distance between the two points to the nearest HUNDREDTH and returns this value.

    public double distance(){
        double sumOfSquares = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
        double sqrt = Math.sqrt(sumOfSquares);
        return roundedToHundredth(sqrt);
    }

    //yInt() -> returns a double.
    //calculates the y intercept of the equation and returns the value to the nearest HUNDREDTH
    public double yInt(){
        double b = y1 - slope()*x1;
        return roundedToHundredth(b);
    }

    //slope() -> returns a double. 
    //calculates the slope of the equations and returns the value to the nearest HUNDREDTH
    public double slope(){
        double slope = (double) (y2 - y1) / (x2 - x1);
        return roundedToHundredth(slope);
    }

    //equations() -> return a String.
    //calculates the final equation in y=mx+b form and returns the string
    //if the equation has no slope, the equation should return -> "undefined"
    //HINT: You may need other custom methods to lessen the amount of code in the equations() method
    //you will tested on them but they should serve to pass the required tests on equation()
    public String equation(){
        double y_int = yInt();
        double slope = slope();
        //test for y-int == 0 
        if (yInt() == 0.0){
            return "y="+slope+"x+";
        }

        if(x1==x2){ //undefined
            return "undefined";
        }else{
            //deal with sign of y-int
            if (y_int<0.0){
                return "y="+slope+"x"+y_int;
            }else{
                return "y="+slope+"x+"+y_int;
            }
        }
    }


    //roundedToHundredth(double x)-> returns double
    //calculates the input to the nearest hundredth and returns that value
    public double roundedToHundredth(double x){
        double roundedNumber = Math.round(x * 100) / 100.0;
        return roundedNumber;
    }

    public String printInfo(){
        String str = "The two points are: (" + x1 + ", " + y1 + ")";
        str += " and " + "(" + x2 + ", " + y2 + ")";
        str += "\nThe equation of the line between these points is: " + equation();
        str += "\nThe slope of this line is: " + slope();
        str += "\nThe y-intercept of the line is: " + yInt();
        str += "\nThe distance between the two points is: " + distance();
 
        return str;
    }







}