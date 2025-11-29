package org.example.leetcode;


//Easy level
public class MaximumAverageSubarrayI643 {


    public static int getMaximumSumSubArrayInWindow(int [] array,int window) {

        if (window > array.length)
            return -1;

        int sumSubArray = 0;
        for (int i = 0 ; i < window ; i++) {
            sumSubArray+=array[i];
        }

        int maxSum = sumSubArray;


        for (int i = 1;i <= array.length - window;i++) {
            sumSubArray = sumSubArray - array[i - 1] + array[window - 1 + i];
            maxSum = Math.max(sumSubArray,maxSum);
        }


        return maxSum;
    }

    public static double getAvergae(int sum,int k) {
        return (double) sum / k;
    }

    public static void main(String[] args) {
        int [] nums = {5}; //6 9 14 17 15 12
        int k = 1;
        System.out.println(getAvergae(getMaximumSumSubArrayInWindow(nums,k),k));

    }
}
