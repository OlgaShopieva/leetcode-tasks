package com.example.leetcodetasks.easy.String;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A string is good if there are no repeated characters.
 * Given a string s, return the number of good substrings of length three in s.
 * Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
 * A substring is a contiguous sequence of characters in a string.
 * Example 1:
 * Input: s = "xyzzaz"
 * Output: 1
 * Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz".
 * The only good substring of length 3 is "xyz".
 * Example 2:
 * Input: s = "aababcabc"
 * Output: 4
 * Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
 * The good substrings are "abc", "bca", "cab", and "abc".
 */
public class CountGoodSubstr {

    //method1
    public int countGoodSubstrings(String s) {
        int inputLength = s.length();
        int substringLength = 3;

        List<String> substrings = new ArrayList<>();

        for (int i = 0; i <= inputLength - substringLength; i++) {
            String sub = s.substring(i, i + substringLength);
            substrings.add(sub);
        }
        Iterator<String> iterator = substrings.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (hasDuplicateChars(element)) {
                iterator.remove();
            }
        }
        return substrings.size();
    }

    private static boolean hasDuplicateChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (c == str.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    //method2
//    public int countGoodSubstrings(String s) {
//        int result = 0;
//        for (int r = 2; r < s.length(); r++) {
//            char a = s.charAt(r - 2);
//            char b = s.charAt(r - 1);
//            char c = s.charAt(r);
//            if (a != b && b != c && a != c) {
//                result++;
//            }
//        }
//        return result;
//    }
}
