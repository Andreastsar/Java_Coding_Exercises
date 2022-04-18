package com.company;

import java.lang.reflect.Type;

public class Main {

    public static void main(String[] args) {

        //String is a datatype - NOT A PRIMITIVE type - ACTUALLY A CLASS

        String myString = "This is a string";
        System.out.println("myString is equal to: " + myString);
        myString = myString + ", and this is more";
        System.out.println("myString is equal to: " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to: " + myString);

        // String
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myint = 50;
        lastString = lastString + myint;
        System.out.println(lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);


    }
}
