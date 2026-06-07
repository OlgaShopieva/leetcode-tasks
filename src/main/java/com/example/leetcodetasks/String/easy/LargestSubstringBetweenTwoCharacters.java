package com.example.leetcodetasks.String.easy;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s, return the length of the longest substring between two equal characters, excluding the two characters. If there is no such substring return -1.
 * A substring is a contiguous sequence of characters within a string.
 * Example 1:
 * Input: s = "aa"
 * Output: 0
 * Explanation: The optimal substring here is an empty substring between the two 'a's.
 * Example 2:
 * Input: s = "abacdfa"
 * Output: 2
 * Explanation: The optimal substring here is "bc".
 * Example 3:
 * Input: s = "cbzxy"
 * Output: -1
 * Explanation: There are no characters that appear twice in s.
 */
public class LargestSubstringBetweenTwoCharacters {

    public static void main(String[] args) {
        String s = "abacdfa";
        System.out.println(maxLengthBetweenEqualCharacters(s));
    }

    public static int maxLengthBetweenEqualCharacters(String s) {
        char[] array = s.toCharArray();
        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    res.add(j - i - 1);
                }
            }
        }
        return res.isEmpty() ? -1 : Collections.max(res);
    }
}
