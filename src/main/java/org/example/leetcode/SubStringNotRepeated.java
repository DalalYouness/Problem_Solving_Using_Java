package org.example.leetcode;


import java.util.*;

import static java.util.Set.*;

//Problem: Find K-Length Substrings With No Repeated Characters
//Medium level



public class SubStringNotRepeated {
//    public static int getNumberOfNotRpeatedString(String s , int subStringLenght) {
//        int distinctSubStrings = 0;
//        String lowerString = s.toLowerCase();
//        Set<Character> distinctCharacters = new HashSet<>();
//        List<Character> list = new ArrayList<>();
//
//        for (int i = 0; i < subStringLenght;i++) {
//            list.add(lowerString.charAt(i));
//        }
//
//        distinctCharacters.addAll(list);
//
//        if (list.size() == distinctCharacters.size()) {
//            distinctSubStrings++;
//        }
//
//        for (int i = 1 ; i <= lowerString.length() - subStringLenght;i++) {
//
//            Character c = lowerString.charAt(i - 1);
//            list.remove(c);
//            list.add(lowerString.charAt(subStringLenght + i - 1));
//            distinctCharacters.clear();
//            distinctCharacters.addAll(list);
//
//            if (list.size() == distinctCharacters.size()) {
//                distinctSubStrings++;
//            }
//        }
//        return distinctSubStrings;
//    }



    public static int numKLenSubstrNoRepeats(String s, int k) {
        if (k > s.length()) return 0;

        int[] freq = new int[26];
        int left = 0;
        int count = 0;
        int distinct = 0;

        for (int right = 0; right < s.length(); right++) {

            int r = s.charAt(right) - 'a';

            freq[r]++;
            if (freq[r] == 1) distinct++;

            if (right - left + 1 > k) {
                int l = s.charAt(left) - 'a';
                freq[l]--;
                if (freq[l] == 0) distinct--;
                left++;
            }

            if (right - left + 1 == k && distinct == k) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

            String s = "abcabcbb";
            int k = 3;

            System.out.println(numKLenSubstrNoRepeats(s,k));


    }
}
