package com.example.leetcodetasks.easy.String;

/**
 * Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
 * For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
 * Return the resulting string.
 * Example 1:
 * Input: word = "abcdefd", ch = "d"
 * Output: "dcbaefd"
 * Explanation: The first occurrence of "d" is at index 3.
 * Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
 */
public class ReversePrefixWord {

    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }

    public static String reversePrefix(String word, char ch) {
        char[] charArray = word.toCharArray();
        for (int j = 0; j < word.length(); j++) {
            if (word.charAt(j) == ch) {
                int i = 0;
                while (i < j) {
                    swap(charArray, i++, j--);
                }
                return new String(charArray);
            }
        }
        return word;
    }

    private static void swap(char[] chars, int start, int end) {
        char temp = chars[end];
        chars[end] = chars[start];
        chars[start] = temp;
    }
}
