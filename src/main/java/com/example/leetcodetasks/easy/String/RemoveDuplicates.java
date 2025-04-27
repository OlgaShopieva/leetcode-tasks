package com.example.leetcodetasks.easy.String;

import java.util.Stack;

/**
 * You are given a string s consisting of lowercase English letters.
 * A duplicate removal consists of choosing two adjacent and equal letters and removing them.
 * We repeatedly make duplicate removals on s until we no longer can.
 * Return the final string after all such duplicate removals have been made.
 * It can be proven that the answer is unique.
 * Example 1:
 * Input: s = "abbaca"
 * Output: "ca"
 * Explanation:
 * For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal,
 * and this is the only possible move.
 * The result of this move is that the string is "aaca", of which only "aa" is possible,
 * so the final string is "ca".
 * Example 2:
 * Input: s = "azxxzy"
 * Output: "ay"
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }

    public static String removeDuplicates(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char cur : chars) {
            if (!stack.isEmpty()) {
                char end = stack.peek();
                if (cur == end) {
                    stack.pop();
                } else {
                    stack.push(cur);
                }
            } else {
                stack.push(cur);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character item : stack) {
            sb.append(item);
        }
        return sb.toString();
    }

    //method2
//    public String removeDuplicates(String s) {
//
//        char[] sta = new char[s.length()];
//
//        int top = -1;
//
//        for(char c : s.toCharArray())
//        {
//            if(top >= 0 && sta[top] == c)
//            {
//                top--;
//            }
//            else{
//                sta[++top] = c;
//            }
//        }
//        return new String(sta,0,top+1);
}
