package com.example.leetcodetasks.easy.String;

import java.util.Arrays;

/**
 * Given an integer n, return a string with n characters such that
 * each character in such string occurs an odd number of times.
 * The returned string must contain only lowercase English letters.
 * If there are multiples valid strings, return any of them.
 * Example 1:
 * Input: n = 4
 * Output: "pppz"
 * Explanation: "pppz" is a valid string since the character 'p' occurs three times
 * and the character 'z' occurs once. Note that there are many other valid strings
 * such as "ohhh" and "love".
 */
public class GenerateString {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(generateTheString(n));
    }

    public static String generateTheString(int n) {
        var result = new char[n];
        Arrays.fill(result, 'a');
        if (n % 2 == 0) result[0] = 'b';
        return new String(result);
    }
}
