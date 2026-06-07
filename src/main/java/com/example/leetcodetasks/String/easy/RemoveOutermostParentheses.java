package com.example.leetcodetasks.String.easy;

/**
 * A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings,
 * and + represents string concatenation.
 * For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
 * A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B,
 * with A and B nonempty valid parentheses strings.
 * Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk,
 * where Pi are primitive valid parentheses strings.
 * Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.
 * Example 1:
 * Input: s = "(()())(())"
 * Output: "()()()"
 * Explanation:
 * The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
 * After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
 */
public class RemoveOutermostParentheses {

    public String removeOuterParentheses(String s) {
        int balancer = 0;
        int start = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            balancer += s.charAt(i) == '(' ? 1 : -1;
            if(balancer == 0) {
                sb.append(s, start + 1, i);
                start = i + 1;
            }
        }
        return sb.toString();
    }
}
