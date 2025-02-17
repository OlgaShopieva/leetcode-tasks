package com.example.leetcodetasks.easy.String;

/**
 * Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".
 * A string is palindromic if it reads the same forward and backward.
 * Example 1:
 * Input: words = ["abc","car","ada","racecar","cool"]
 * Output: "ada"
 * Explanation: The first string that is palindromic is "ada".
 * Note that "racecar" is also palindromic, but it is not the first.
 * Example 2:
 * Input: words = ["notapalindrome","racecar"]
 * Output: "racecar"
 * Explanation: The first and only string that is palindromic is "racecar".
 */
public class FirstPalindrome {

    public static void main(String[] args) {
        String[] words = new String[]{"def","ghi"};
        System.out.println(firstPalindrome(words));
    }
    public static String firstPalindrome(String[] words) {
        String firstPalindrome = "";
        for(String word: words) {
            if(checkIfPalindrome(word)) {
                firstPalindrome = word;
                break;
            }
        }
        return firstPalindrome;
    }

    private static boolean checkIfPalindrome(String word) {
        int i = 0;
        int j = word.length() - 1;
        while (i <= j) {
            if(word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
