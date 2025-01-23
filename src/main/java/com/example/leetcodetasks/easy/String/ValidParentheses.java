package com.example.leetcodetasks.easy.String;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * Example 1:
 * Input: s = "()"
 * Output: true
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 * Input: s = "(]"
 * Output: false
 * Example 4:
 * Input: s = "([])"
 * Output: true
 */
public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    public static boolean isValid(String s) {

        char[] charArray = new char[s.length() + 1];
        int stackIndex = 1;
        for(char c: s.toCharArray()) {
            switch (c) {
                case '(', '{', '[':
                    charArray[stackIndex] = c;
                    stackIndex++;
                    break;
                case ')':
                    if (charArray[stackIndex -1] != '(') {
                        return false;
                    }
                    stackIndex--;
                    break;
                case '}':
                    if(charArray[stackIndex - 1] != '{') {
                        return false;
                    }
                    stackIndex--;
                    break;
                case ']':
                    if(charArray[stackIndex -1] != '[') {
                        return false;
                    }
                    stackIndex--;
                    break;
            }
        }
        return stackIndex == 1;
    }
}
