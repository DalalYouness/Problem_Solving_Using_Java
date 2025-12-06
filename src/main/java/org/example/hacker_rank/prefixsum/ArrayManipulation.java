package org.example.hacker_rank.prefixsum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


// hard level
public class ArrayManipulation {
    public static long getMax(long[] diffArray) {
        long max = 0;
        long acc = 0;

        for (int i = 0; i < diffArray.length; i++) {
            acc+=diffArray[i];
            if (acc > max) max = acc;
        }
        return max;
    }

    public static long arrayManipulation(int n, List<List<Integer>> queries) {


        // prefix dynamic methode
        long [] myArr = new long[n];
        int left , right;
        long value;

        for (int i = 0 ; i < queries.size();i++) {
            left = queries.get(i).get(0) - 1;
            right = queries.get(i).get(1) - 1;
            value = queries.get(i).get(2);
            myArr[left] += value;
            if(right + 1 < n)
                myArr[right + 1] -= value;

        }

        return getMax(myArr);

}
    public static void main(String[] args) {
        List<List<Integer>> lists = List.of(List.of(1, 2, 100), List.of(2, 5, 100), List.of(3, 4, 100));
        System.out.println(arrayManipulation(5, lists));

    }
}


// brute force methode
//        //defining an array with n lenght with default values 0
//       int [] myArr = new int[n];
//
//       //step 1 : size dyal query howa nombre dyal les operations li ghadin ydaro
//        for (int i = 0 ; i < queries.size();i++) {
//            for (int j = queries.get(i).get(0) - 1 ; j < queries.get(i).get(1) ; j++) {
//                myArr[j] = myArr[j] + queries.get(i).get(2);
//            }
//        }
//        Arrays.sort(myArr);
//        return myArr[n - 1];

