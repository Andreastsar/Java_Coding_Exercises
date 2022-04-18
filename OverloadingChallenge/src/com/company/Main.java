package com.company;

public class Main {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(6 , 0);
        calcFeetAndInchesToCentimeters(100);

	    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet >= 0 && (inches >= 0 && inches <=12)){
            double feetToCm = feet * 12d * 2.54d;
            double inchToCm = inches * 2.54d;
            System.out.println(feet + " feet = " + feetToCm + " centimeters");
            System.out.println(inches + " inches = " + inchToCm + " centimeters");
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0){
            double feet = inches / 12d;
            calcFeetAndInchesToCentimeters(feet, inches);
        }
        return -1;
    }
}
