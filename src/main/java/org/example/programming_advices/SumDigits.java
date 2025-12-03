package org.example.programming_advices;

import java.util.Scanner;

public class SumDigits {

    public static int readPositiveNumber() {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("please enter a number ?");
            a = sc.nextInt();
        }while(a < 0);

        return a;
    }

    public static int sumDegits(int number) {


        if(number < 10)
        {
            return number;
        }

        int sum = 0;
        int restValue = 0;
        number = Math.abs(number);

        while (number >= 1 ) {
            restValue = number % 10;
            number /= 10;
            sum+=restValue;
        }
        return sum;

    }
    public static void main(String[] args) {

        System.out.println(sumDegits(readPositiveNumber()));
    }
}
