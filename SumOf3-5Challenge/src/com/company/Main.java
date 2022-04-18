package com.company;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int counter = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum += i;
                counter++;
                System.out.println("Number " + i + " fulfills the conditions");
                if (counter == 5) {
                    break;
                }
            }
        }
        System.out.println("The sum of numbers fulfilling the conditions is = " + sum);
    }
}