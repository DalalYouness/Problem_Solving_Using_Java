package org.example.programming_advices;

import java.util.Scanner;

public class PerfectNumber {
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


    public static void main(String[] args) {

        int number = readPositiveNumber();
        if(isPerfect(number)) {
            System.out.println("%d is perfect".formatted(number));
        }
        else {
            System.out.println(String.format("%d is not perfect",number));
        }
    }
}
