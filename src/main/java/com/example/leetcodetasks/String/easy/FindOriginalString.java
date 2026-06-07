package com.example.leetcodetasks.String.easy;

/**
 * Alice is attempting to type a specific string on her computer. However, she tends to be clumsy and may press
 * a key for too long, resulting in a character being typed multiple times.
 * Although Alice tried to focus on her typing, she is aware that she may still have done this at most once.
 * You are given a string word, which represents the final output displayed on Alice's screen.
 * Return the total number of possible original strings that Alice might have intended to type.
 * Example 1:
 * Input: word = "abbcccc"
 * Output: 5
 * Explanation:
 * The possible strings are: "abbcccc", "abbccc", "abbcc", "abbc", and "abcccc".
 * Example 2:
 * Input: word = "abcd"
 * Output: 1
 * Explanation:
 * The only possible string is "abcd".
 * Example 3:
 * Input: word = "aaaa"
 * Output: 4
 */
public class FindOriginalString {
    public static void main(String[] args) {
        String word = "abbcccc";
        System.out.println(possibleStringCount(word));
    }

    public static int possibleStringCount(String word) {
        int count = 1;
        char[] array = word.toCharArray();
        int n = array.length;
        for (int i = 1; i < n; i++) {
            if(array[i] == array[i - 1]) {
                count++;
            }
        }
        return count;
    }
}
