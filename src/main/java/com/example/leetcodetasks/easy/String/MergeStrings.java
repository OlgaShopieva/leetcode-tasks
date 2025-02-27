package com.example.leetcodetasks.easy.String;

/**
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
 * starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 * Return the merged string.
 * Example 1:
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * Explanation: The merged string will be merged as so:
 * word1:  a   b   c
 * word2:    p   q   r
 * merged: a p b q c r
 * Example 2:
 * Input: word1 = "ab", word2 = "pqrs"
 * Output: "apbqrs"
 */
public class MergeStrings {
    public static void main(String[] args) {
       String word1 = "abc", word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if(i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if(i < word2.length()) {
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}
