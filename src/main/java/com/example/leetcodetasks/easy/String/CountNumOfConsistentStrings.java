package com.example.leetcodetasks.easy.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * You are given a string allowed consisting of distinct characters and an array of strings words.
 * A string is consistent if all characters in the string appear in the string allowed.
 * Return the number of consistent strings in the array words.
 * Example 1:
 * Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
 * Output: 2
 * Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
 * Example 2:
 * Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
 * Output: 7
 * Explanation: All strings are consistent.
 */
public class CountNumOfConsistentStrings {
    public static void main(String[] args) {
        String allowed = "abc";
        String[] words = new String[]{"a","b","c","ab","ac","bc","abc"};
        System.out.println(countConsistentStrings(allowed, words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for(char c: allowed.toCharArray()) {
            set.add(c);
        }

        int count = 0;
        for (String word: words) {
            boolean isConsistent = true;
            for(char ch: word.toCharArray()) {
                if(!set.contains(ch)) {
                    isConsistent = false;
                    break;
                }
            }
            if(isConsistent) {
                count++;
            }
        }
        return count;
    }
}
