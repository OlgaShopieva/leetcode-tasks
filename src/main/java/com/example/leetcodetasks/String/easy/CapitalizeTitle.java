package com.example.leetcodetasks.String.easy;

import java.util.Stack;

/**
 * You are given a string title consisting of one or more words separated by a single space,
 * where each word consists of English letters. Capitalize the string by changing the capitalization of each word such that:
 * If the length of the word is 1 or 2 letters, change all letters to lowercase.
 * Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
 * Return the capitalized title.
 * Example 1:
 * Input: title = "capiTalIze tHe titLe"
 * Output: "Capitalize The Title"
 * Explanation:
 * Since all the words have a length of at least 3, the first letter of each word is uppercase,
 * and the remaining letters are lowercase.
 */
public class CapitalizeTitle {
    public static void main(String[] args) {
        String title = "First Letter of Each Word";
        System.out.println(capitalizeTitle(title));
    }

    public static String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word: words) {
            if(word.length() == 1 || word.length() == 2) {
                sb.append(word.toLowerCase());
                sb.append(" ");
            } else {
                sb.append(word.substring(0, 1).toUpperCase());
                sb.append(word.substring(1).toLowerCase());
                sb.append(" ");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    /**
     * Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
     * Given a balanced string s, split it into some number of substrings such that:
     * Each substring is balanced.
     * Return the maximum number of balanced strings you can obtain.
     * Example 1:
     * Input: s = "RLRRLLRLRL"
     * Output: 4
     * Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
     * Example 2:
     * Input: s = "RLRRRLLRLL"
     * Output: 2
     * Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
     * Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.
     * Example 3:
     * Input: s = "LLLLRRRR"
     * Output: 1
     * Explanation: s can be split into "LLLLRRRR".
     */
    public static class BalancedString {

        public static int balancedStringSplit(String s) {
            int count = 0;
            int balancer = 0;

            for(int i = 0; i < s.length(); i++) {
                balancer += s.charAt(i) == 'R' ? 1 : -1;
                if(balancer == 0) {
                    count++;
                }
            }
            return count;
        }
    }

    /**
     *You are given a string s.
     * Your task is to remove all digits by doing this operation repeatedly:
     * Delete the first digit and the closest non-digit character to its left.
     * Return the resulting string after removing all digits.
     * Note that the operation cannot be performed on a digit that does not have any non-digit character to its left.
     * Example 1:
     * Input: s = "abc"
     * Output: "abc"
     * Explanation:
     * There is no digit in the string.
     * Example 2:
     * Input: s = "cb34"
     * Output: ""
     * Explanation:
     * First, we apply the operation on s[2], and s becomes "c4".
     * Then we apply the operation on s[1], and s becomes "".
     */
    public static class ClearDigits {

        public String clearDigits(String s) {
            Stack<Character> stack = new Stack<>();
            int n = s.length();
            for(int i = 0; i < n; i++) {
                if(!Character.isDigit(s.charAt(i))) {
                    stack.push(s.charAt(i));
                } else {
                    if(!stack.isEmpty()) {
                        stack.pop();
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
                sb.insert(0, stack.pop());
            }
            return sb.toString();
        }
    }
}
