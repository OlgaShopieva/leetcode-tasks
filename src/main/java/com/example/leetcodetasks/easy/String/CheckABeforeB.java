package com.example.leetcodetasks.easy.String;

/**
 * Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' appears before every 'b'
 * in the string. Otherwise, return false.
 * Example 1:
 * Input: s = "aaabbb"
 * Output: true
 * Explanation:
 * The 'a's are at indices 0, 1, and 2, while the 'b's are at indices 3, 4, and 5.
 * Hence, every 'a' appears before every 'b' and we return true.
 * Example 2:
 * Input: s = "abab"
 * Output: false
 * Explanation:
 * There is an 'a' at index 2 and a 'b' at index 1.
 * Hence, not every 'a' appears before every 'b' and we return false.
 */
public class CheckABeforeB {

    public static void main(String[] args) {
        String s = "aaba";
        System.out.println(checkString(s));
    }

    public static boolean checkString(String s) {
       char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'b') {
                return !s.substring(i, chars.length).contains("a");
            }
        }
        return true;
    }

    //method2
//    boolean isB = false;
//        for (char c : s.toCharArray()) {
//        if (isB && c == 'a') {
//            return false;
//        }
//        if (c == 'b') {
//            isB = true;
//        }
//    }
//        return true;
}
