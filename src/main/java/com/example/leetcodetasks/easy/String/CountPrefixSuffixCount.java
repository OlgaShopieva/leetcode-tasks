package com.example.leetcodetasks.easy.String;

/**
 * You are given a 0-indexed string array words.
 * Let's define a boolean function isPrefixAndSuffix that takes two strings, str1 and str2:
 * isPrefixAndSuffix(str1, str2) returns true if str1 is both a prefix and a suffix of str2, and false otherwise.
 * For example, isPrefixAndSuffix("aba", "ababa") is true because "aba" is a prefix of "ababa" and also a suffix,
 * but isPrefixAndSuffix("abc", "abcd") is false.
 * Return an integer denoting the number of index pairs (i, j) such that i < j,
 * and isPrefixAndSuffix(words[i], words[j]) is true.
 * Example 1:
 * Input: words = ["a","aba","ababa","aa"]
 * Output: 4
 * Explanation: In this example, the counted index pairs are:
 * i = 0 and j = 1 because isPrefixAndSuffix("a", "aba") is true.
 * i = 0 and j = 2 because isPrefixAndSuffix("a", "ababa") is true.
 * i = 0 and j = 3 because isPrefixAndSuffix("a", "aa") is true.
 * i = 1 and j = 2 because isPrefixAndSuffix("aba", "ababa") is true.
 * Therefore, the answer is 4.
 */
public class CountPrefixSuffixCount {
    public static void main(String[] args) {
        String[] words = new String[]{"a","aba","ababa","aa"};
        System.out.println(countPrefixSuffixPairs(words));
    }

    public static int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        int n = words.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = i+1; j < n; j++) {
                if(isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isPrefixAndSuffix(String str1, String str2) {
        if(str1.length() > str2.length()) return false;
        String prefix = str2.substring(0, str1.length());
        String suffix = str2.substring(str2.length() - str1.length());
        return str1.equals(prefix) && str1.equals(suffix);
    }
}
