package com.example.leetcodetasks.easy;

import java.util.Stack;

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
public class ClearDigits {

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
