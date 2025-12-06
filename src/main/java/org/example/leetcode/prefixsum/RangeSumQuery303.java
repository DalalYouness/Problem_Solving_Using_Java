package org.example.leetcode.prefixsum;


class NumArray {

    private int [] prefixSumArray;
    public NumArray(int[] nums) {
        prefixSumArray = new int[nums.length];
        prefixSumArray[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefixSumArray[i] = prefixSumArray[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if(left == 0)
            return prefixSumArray[right];
        return prefixSumArray[right] - prefixSumArray[left - 1];
    }
}

public class RangeSumQuery303 {
    public static void main(String[] args) {

        int [] arr = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(arr);

        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));
        System.out.println(numArray.sumRange(0, 5));
    }
}

