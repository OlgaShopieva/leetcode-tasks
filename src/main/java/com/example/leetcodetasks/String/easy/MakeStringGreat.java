package com.example.leetcodetasks.String.easy;

import java.util.Stack;

/**
 * Given a string s of lower and upper case English letters.
 * A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:
 * 0 <= i <= s.length - 2
 * s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
 * To make the string good, you can choose two adjacent characters that make the string bad and remove them.
 * You can keep doing this until the string becomes good.
 * Return the string after making it good. The answer is guaranteed to be unique under the given constraints.
 * Notice that an empty string is also good.
 * Example 1:
 * Input: s = "leEeetcode"
 * Output: "leetcode"
 * Explanation: In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode".
 */
public class MakeStringGreat {
    public static void main(String[] args) {
        String s = "leEeetcode";
        System.out.println(makeGood(s));
    }

    public static String makeGood(String s) {
        if(s.length() < 2) return s;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else {
                if(Math.abs(s.charAt(i) - stack.peek()) == 32) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }

        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}
