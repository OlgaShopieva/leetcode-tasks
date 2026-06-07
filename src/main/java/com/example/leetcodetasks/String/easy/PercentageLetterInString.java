package com.example.leetcodetasks.String.easy;

/**
 * Given a string s and a character letter, return the percentage of characters in s that equal letter
 * rounded down to the nearest whole percent.
 * Example 1:
 * Input: s = "foobar", letter = "o"
 * Output: 33
 * Explanation:
 * The percentage of characters in s that equal the letter 'o' is 2 / 6 * 100% = 33% when rounded down, so we return 33.
 * Example 2:
 * Input: s = "jjjj", letter = "k"
 * Output: 0
 * Explanation:
 * The percentage of characters in s that equal the letter 'k' is 0%, so we return 0.
 */
public class PercentageLetterInString {
    public static void main(String[] args) {
       String s = "jjjj"; char letter = 'k';
        System.out.println(percentageLetter(s, letter));
    }

    public static int percentageLetter(String s, char letter) {
        int count = 0;
        for(char ch: s.toCharArray()) {
            if(ch == letter) {
                count++;
            }
        }
        double result = ((double)count / s.length()) * 100;
        return (int)result;
    }
}
