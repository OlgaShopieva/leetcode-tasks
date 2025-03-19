package com.example.leetcodetasks.easy.String;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s, you have two types of operation:
 * 1. Choose an index i in the string, and let c be the character in position i. Delete the closest occurrence of c to the left of i (if exists).
 * 2. Choose an index i in the string, and let c be the character in position i. Delete the closest occurrence of c to the right of i (if exists).
 * Your task is to minimize the length of s by performing the above operations zero or more times.
 * Return an integer denoting the length of the minimized string.
 * Example 1:
 * Input: s = "aabc"
 * Output: 3
 * Explanation:
 * Operation 2: we choose i = 1 so c is 'a', then we remove s[2] as it is closest 'a' character to the right of s[1].
 * s becomes "aabc" after this.
 * Operation 1: we choose i = 1 so c is 'a', then we remove s[0] as it is closest 'a' character to the left of s[1].
 * s becomes "abc" after this.
 */
public class MinimizeStringLength {

    public int minimizedStringLength(String s) {
        int res = 0;
        boolean[] letters = new boolean[26];
        char[] chars = s.toCharArray();
        for(char ch: chars) {
            letters[ch - 'a'] = true;
        }

        for(boolean isExist: letters) {
            if(isExist) res++;
        }
        return res;
    }
}
