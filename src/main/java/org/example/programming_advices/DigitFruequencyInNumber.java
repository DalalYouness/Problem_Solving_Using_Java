package org.example.programming_advices;

import java.util.Scanner;

public class DigitFruequencyInNumber {

    public static int readPositiveNumber() {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("please enter a number ?");
            a = sc.nextInt();
        }while(a < 0);

        return a;
    }

    public static int readDigit() {
        int digit = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("please enter a digit ?");
            digit = sc.nextInt();

        }while(digit <0 || digit >= 10);

        return digit;

    }

    public static int digitFrequencyInNumber(int number , int digit) {
        if(digit <0 || digit >= 10 ) {
            throw new ArithmeticException(("digit must be between 0 and 9 inclusive"));
        }

        int frequency = 0;
        int remainder = 0;

        while( number >= 1) {
            remainder = number % 10;
            number/=10;
            if(remainder == digit) frequency++;
        }

        return frequency;


    }


    public static void main(String[] args) {

        System.out.println(digitFrequencyInNumber(readPositiveNumber(),readDigit()));
    }
}
