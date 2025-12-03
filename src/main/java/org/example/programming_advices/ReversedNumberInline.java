package org.example.programming_advices;

import java.util.Scanner;

public class ReversedNumberInline {

    public static int readPositiveNumber() {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("please enter a number ?");
            a = sc.nextInt();
        }while(a < 0);

        return a;
    }

    public static int getReveredNumber(int number) {

        System.out.println("reversed number is : ");
        if(number < 10)
        {
            return number;
        }

        int restValue = 0;
        number = Math.abs(number);

        int reverseNumber = 0;

        while (number >= 1 ) {
            restValue = number % 10;
            reverseNumber = restValue +  reverseNumber * 10;
            number /= 10;


        }

        return reverseNumber;
    }
    public static void main(String[] args) {
        System.out.println(getReveredNumber(readPositiveNumber()));
    }
}
