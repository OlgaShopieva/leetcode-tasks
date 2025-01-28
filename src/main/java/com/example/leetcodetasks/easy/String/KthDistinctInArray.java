package com.example.leetcodetasks.easy.String;

import java.util.*;

/**
 * A distinct string is a string that is present only once in an array.
 * Given an array of strings arr, and an integer k, return the kth distinct string present in arr.
 * If there are fewer than k distinct strings, return an empty string "".
 * Note that the strings are considered in the order in which they appear in the array.
 * Example 1:
 * Input: arr = ["d","b","c","b","c","a"], k = 2
 * Output: "a"
 * Explanation:
 * The only distinct strings in arr are "d" and "a".
 * "d" appears 1st, so it is the 1st distinct string.
 * "a" appears 2nd, so it is the 2nd distinct string.
 * Since k == 2, "a" is returned.
 */
public class KthDistinctInArray {
    public static void main(String[] args) {
        String[] arr = new String[]{"a", "a", "s"};
        int k = 1;
        System.out.println(kthDistinct(arr, k));
    }

    public static String kthDistinct(String[] arr, int k) {
        Map<String, Boolean> map = new HashMap<>();
        int count = 0;
        for (String string : arr) {
            if (map.containsKey(string)) {
                map.put(string, false);
            } else {
                map.put(string, true);
            }
        }
        for (String s : arr) {
            if(map.get(s)) {
                count++;
                if(count == k) {
                    return s;
                }
            }
        }
        return "";
    }

}
