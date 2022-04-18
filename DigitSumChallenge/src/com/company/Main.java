package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("The sum of digits of 347 is " + sumDigits(347));
        System.out.println("The sum of digits of 125 is " + sumDigits(125));
        System.out.println("The sum of digits of -12 is " + sumDigits(-12));
        System.out.println("The sum of digits of 9 is " + sumDigits(9));

    }

    public static int sumDigits(int number){

        if(number < 10){
            return -1;
        }

        int sum = 0;
        while(number > 0) {
            int add = number % 10;
            sum += add;
            number = number / 10;
        }

        return sum;
    }
}
