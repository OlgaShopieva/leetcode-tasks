package com.example.leetcodetasks.easy.String;

/**
 * Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
 * Example 1:
 * Input: s = "Hello"
 * Output: "hello"
 */
public class ToLowerCase {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(toLowerCase(s));
    }

    public static String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();
        for(char c: s.toCharArray()) {
            if(c >= 'A' && c <= 'Z') {
                result.append((char)(c + 32));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
