package com.company;

public class Main {

    public static void main(String[] args) {

        double myD1 = 20.00d;
        double myD2 = 80.00d;
        double myD12 = (myD1 + myD2) * 100.00d; // (myD1 + myD2) * 100
        double myD3 = myD12 % 40.00d;  // myD12 % myD3
        boolean myD4 = (myD3 == 0) ? true : false;
        System.out.println(myD4);
        if (myD4 == false) {
            System.out.println("Got some remainder!");
        }
    }
}