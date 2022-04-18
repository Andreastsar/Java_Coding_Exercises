package com.company;

public class Main {

    public static void main(String[] args) {

        byte myByteChaValue = 8;
        short myShortChaValue = 132;
        int myIntChaValue = 15000;
        long myLongChaValue = 50000L + (10L * (myByteChaValue + myShortChaValue + myIntChaValue));
        System.out.println(myLongChaValue);

        short shortTotal = (short) (1000 + 10 * (myByteChaValue + myShortChaValue + myIntChaValue));
        System.out.println(shortTotal);

    }
}
