package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        int sum = 0;
//
//        for (int i=1; i<11; i++) {
//            System.out.println("Enter number #" + i);
//
//            boolean hasNextInt = scanner.hasNextInt();
//
//            if (hasNextInt) {
//                int number = scanner.nextInt();
//                sum += number;
//            }
//        }
//        System.out.println("The sum of given numbers is: " + sum);
//        scanner.close();

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
                if (counter == 10) {
                    break;
                }

            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("Sum = " + sum);
        scanner.close();
    }
}
