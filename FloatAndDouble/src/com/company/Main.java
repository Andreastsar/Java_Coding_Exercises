package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Maximum Value = " + myMaxFloatValue);
        System.out.println("Float Minimum Value = " + myMinFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        int myIntValue = 5 /3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double pounds = 200d;
        double kilos = pounds * 0.45359237d;
        System.out.println(pounds + " pounds are : " + kilos + " kgs");

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_789d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}