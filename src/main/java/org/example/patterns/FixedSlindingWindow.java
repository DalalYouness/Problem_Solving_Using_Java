package org.example.patterns;

public class FixedSlindingWindow {


    public static void main(String[] args) {
        //brute force methode ( classic methode)
//        int[] numbers = { 17, 11, 40, 18, 51, 24, 29, 36, 12, 45 };
//        int fixedWindow = 3;
//
//        int maxSum = -1;
//
//
//        for (int i = 0; i <= numbers.length - 3;i++) {
//            int sumWindow = 0;
//
//            for (int j = i ; j < fixedWindow + i ; j++) {
//                sumWindow+=numbers[j];
//            }
//            maxSum = Math.max(maxSum,sumWindow);
//        }
//
//        System.out.println(maxSum);

        int[] numbers = { 17, 11, 40, 18, 51, 24, 29, 36, 12, 45 };
        int window = 3;


        int sumWindow = 0;
        int greatherSum = -1;

        for (int i = 0 ; i < window ; i++) {
            sumWindow += numbers[i];
        }

        for (int i = window ; i < numbers.length ; i++) {
            greatherSum = Math.max(sumWindow,greatherSum);
            sumWindow = sumWindow + numbers[i] - numbers[i - window];
        }

        // مقارنة آخر نافذة
        greatherSum = Math.max(greatherSum, sumWindow);

        System.out.println(greatherSum);


    }
}
