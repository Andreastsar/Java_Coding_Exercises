package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char letter = 'F';

        switch (letter){

            case 'A':
                System.out.println("Found the A character");
                break;

            case 'B':
                System.out.println("Found the B character");
                break;

            case 'C':
                System.out.println("Found the C character");
                break;

            case 'D':
                System.out.println("Found the D character");
                break;

            case 'E':
                System.out.println("Found the E character");
                break;

            default:
                System.out.println("A,B,C,D,E was not found");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
