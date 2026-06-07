package com.example.leetcodetasks.String.easy;

/**
 * You are given a 0-indexed array of string words and two integers left and right.
 * A string is called a vowel string if it starts with a vowel character and ends with a vowel character
 * where vowel characters are 'a', 'e', 'i', 'o', and 'u'.
 * Return the number of vowel strings words[i] where i belongs to the inclusive range [left, right].
 * Example 1:
 * Input: words = ["are","amy","u"], left = 0, right = 2
 * Output: 2
 * Explanation:
 * - "are" is a vowel string because it starts with 'a' and ends with 'e'.
 * - "amy" is not a vowel string because it does not end with a vowel.
 * - "u" is a vowel string because it starts with 'u' and ends with 'u'.
 * The number of vowel strings in the mentioned range is 2.
 */
public class VowelStrings {
    public static void main(String[] args) {
        String[] words = new String[]{"are","amy","u"};
        int left = 0, right = 2;
        System.out.println(vowelStrings(words, left, right));
    }

    public static int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i = left; i < right; i++) {
           if(isVowel(words[i])) {
               count++;
           }
        }
        return count;
    }

    private static boolean isVowel(String word) {
        char start = word.charAt(0);
        char end = word.charAt(word.length() - 1);
        return (start == 'a' || start == 'e' || start == 'i' || start == 'o' || start == 'u') &&
                (end == 'a' || end == 'e' || end == 'i' || end == 'o' || end == 'u');
    }
}

