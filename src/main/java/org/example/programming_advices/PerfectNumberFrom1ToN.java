package org.example.programming_advices;

import java.util.Scanner;

public class PerfectNumberFrom1ToN {
    public static int readPositiveNumber() {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("please enter a number ?");
            a = sc.nextInt();
        }while(a < 0);

        return a;
    }

    public static boolean isPerfect(int number) {

        if(number <= 1)
            return false;

        int sum = 1;
        int limit = number/2;
        for (int i = 2 ; i <= limit ; i++) {
            if(number % i == 0)
                sum+=i;
        }
        return number == sum;
    }

    public static void printPerfectNumbers(int number) {
        System.out.println("Perfect Numbers:");
        for (int i = 1; i <= number; i++) {
            if(isPerfect(i)) System.out.println(i);
        }
    }
    public static void main(String[] args) {
        printPerfectNumbers(readPositiveNumber());
    }
}
