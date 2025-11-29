package org.example.programming_advices;

import java.util.Scanner;

public class ReverseNumber {
    public static int readPositiveNumber() {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("please enter a number ?");
            a = sc.nextInt();
        }while(a < 0);

        return a;
    }

    public static void printReveredNumber(int number) {

        System.out.println("reverse order is : ");
        if(number < 10)
        {
            System.out.println(number);
            return;
        }

        int restValue = 0;
        number = Math.abs(number);

        while (number >= 1 ) {
            restValue = number % 10;
            number /= 10;
            System.out.println(restValue);
        }

    }
    public static void main(String[] args) {
        // write a program to read a number and print it in a reversed order

        printReveredNumber(readPositiveNumber());
    }
}
