package com.example.leetcodetasks.String.easy;

import java.util.*;

/**
 * You are given a string num representing a large integer. An integer is good if it meets the following conditions:
 * It is a substring of num with length 3.
 * It consists of only one unique digit.
 * Return the maximum good integer as a string or an empty string "" if no such integer exists.
 * Note:
 * A substring is a contiguous sequence of characters within a string.
 * There may be leading zeroes in num or a good integer.
 * Example 1:
 * Input: num = "6777133339"
 * Output: "777"
 * Explanation: There are two distinct good integers: "777" and "333".
 * "777" is the largest, so we return "777".
 * Example 2:
 * Input: num = "2300019"
 * Output: "000"
 * Explanation: "000" is the only good integer.
 */
public class LargestGoodInteger {
    public static void main(String[] args) {
        String num = "222";
        System.out.println(largestGoodInteger(num));
    }

    public static String largestGoodInteger(String num) {
        if(num.length() < 3) return "";
        Set<Integer> result = new HashSet<>();

        for (int i = 1; i < num.length() - 1; i++) {
            if(num.charAt(i) == num.charAt(i - 1) && num.charAt(i) == num.charAt(i + 1)) {
                result.add(Integer.parseInt(num.substring(i - 1, i+ 2)));
            }
        }
        if(result.isEmpty()) return "";

        int max = Integer.MIN_VALUE;

        for (int n : result) {
            if (n > max) {
                max = n;
            }
        }
        if(max == 0) return "000";
        return String.valueOf(max);
    }
}
