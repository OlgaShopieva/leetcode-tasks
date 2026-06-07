package com.example.leetcodetasks.String.easy;

/**
 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace
 * and initial word order.
 * Example 1:
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Example 2:
 * Input: s = "Mr Ding"
 * Output: "rM gniD"
 */
public class ReverseWordsInStringIII {

    public String reverseWords(String s) {
        if(s.length() == 1)
            return s;

        return reverseWord(s.toCharArray(), s.length());
    }
    public String reverseWord(char[] s, int n) {
        int start = 0;
        for(int i = 0; i < n; i++) {
            if(s[i] == ' ') {
                flip(s, start, i-1);
                start = i + 1;
            }
        }
        flip(s, start, n - 1);
        return new String(s);
    }
    public void flip(char[] s, int start, int end) {
        while(start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

}
