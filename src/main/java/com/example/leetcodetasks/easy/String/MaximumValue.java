package com.example.leetcodetasks.easy.String;

/**
 * The value of an alphanumeric string can be defined as:
 * The numeric representation of the string in base 10, if it comprises of digits only.
 * The length of the string, otherwise.
 * Given an array strs of alphanumeric strings, return the maximum value of any string in strs.
 * Example 1:
 * Input: strs = ["alic3","bob","3","4","00000"]
 * Output: 5
 * Explanation:
 * - "alic3" consists of both letters and digits, so its value is its length, i.e. 5.
 * - "bob" consists only of letters, so its value is also its length, i.e. 3.
 * - "3" consists only of digits, so its value is its numeric equivalent, i.e. 3.
 * - "4" also consists only of digits, so its value is 4.
 * - "00000" consists only of digits, so its value is 0.
 * Hence, the maximum value is 5, of "alic3".
 */
public class MaximumValue {
    public static void main(String[] args) {
        String[] strs = new String[]{"5232","yv","22","c","yawgs","928","4003","2"};
        System.out.println(maximumValue(strs));
    }

    public static int maximumValue(String[] strs) {
        int max = 0;
        int curCount = 0;

        for(String word: strs) {
            for(char ch: word.toCharArray()) {
                if (Character.isDigit(ch)) {
                    curCount++;
                }
            }
            if(curCount == word.length()) {
                int curNum = Integer.parseInt(word);
                if(curNum > max) max = curNum;
            } else {
                if(word.length() > max) max = word.length();
            }
            curCount = 0;
        }
        return max;
    }
}
