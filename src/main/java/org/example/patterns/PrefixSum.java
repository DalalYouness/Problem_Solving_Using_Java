package org.example.patterns;

import java.util.Arrays;

public class PrefixSum {


    //classic methode
    public static int sumInIntervel(int [] arr,int firstIndex, int lastIndex) {
        int sum = 0;

        for (int i = firstIndex ; i <= lastIndex ; i++) {
            sum += arr[i];
        }

        return sum;
    }






    // prefix sum methode
    public static int [] generatePrefixSum(int [] arr) {
        int [] prefixSumArray = new int[arr.length];
        prefixSumArray[0] = arr[0];

        for (int i = 1;i<prefixSumArray.length;i++) {
            prefixSumArray[i] = prefixSumArray[i - 1] + arr[i];
        }
        return prefixSumArray;
    }


    public static int sumSubArray(int [] arrayPrefixSum,int firstIndex, int lastIndex) {

        if(firstIndex == 0)
            return arrayPrefixSum[lastIndex];
        return (arrayPrefixSum[lastIndex] - arrayPrefixSum[firstIndex - 1]);
    }

    public static void main(String[] args) {

        /*prefix sum : classique methode pour donner le somme dans intervale definie
        plusieurs fois
        * */
//        int [] numbers = {1,7,3,6,9,7,4,3};
//        System.out.println(sumInIntervel(numbers,1,5));
//        System.out.println(sumInIntervel(numbers,3,6));
//        System.out.println(sumInIntervel(numbers,0,3));
//        System.out.println(sumInIntervel(numbers,2,4));


        /*many queries using prefix sum technique*/
        int [] numbers = {1,7,3,6,9,7,4,3};
        int [] sumArray = generatePrefixSum(numbers);

        System.out.println(sumSubArray(sumArray,1,3));
        System.out.println(sumSubArray(sumArray,0,2));
        System.out.println(sumSubArray(sumArray,3,5));


    }
}
