package org.example.programming_advices;

import java.util.Scanner;

public class PrimeNumbers {
    public static int readPositiveNumber() {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("please enter a number ?");
            a = sc.nextInt();
        }while(a < 0);

        return a;
    }
    public static boolean isPrimeNumber(int number) {

        if(number == 1 || number == 2)
          return true;

        /*parce que le resultat de sqrt c'est le plus grand
        * deviseur de number c'est pour ca pour la performance
        * c'est mieux d'arreter au plus grand diviseur et ne parcourir
        * pas les autres*/
        int theGreatherDevisor = (int) Math.sqrt(number);

        for (int i = 2; i <= theGreatherDevisor ; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
    public static void printPrimeNumbers(int number) {
        for (int i = 1 ; i <= number ; i++) {
            if (isPrimeNumber(i))
                System.out.println(i);
        }
    }

    public static void main(String[] args) {

        /*y'as une methode mathematique plus performante qui s'appelle
        Sieve of Eratosthenes
        * */
        printPrimeNumbers(readPositiveNumber());

    }
}
