package com.example.leetcodetasks.easy.String;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * You are given a string s of even length. Split this string into two halves of equal lengths, and let a be
 * the first half and b be the second half.
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').
 * Notice that s contains uppercase and lowercase letters.
 * Return true if a and b are alike. Otherwise, return false.
 * Example 1:
 * Input: s = "book"
 * Output: true
 * Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
 */
public class HalvesAreAlike {
    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(halvesAreAlike(s));
    }

    private static final boolean[] vowels = setVowels();
    public static boolean halvesAreAlike(String s) {
        char[] arr = s.toCharArray();
        int n = s.length();
        return countVowels(arr,0,n/2) == countVowels(arr,n/2,n);
    }

    public static int countVowels(char[] arr, int strt, int end){
        int cnt = 0;
        for(int i = strt; i<end; i++){
            if(vowels[arr[i]]){
                cnt++;
            }
        }
        return cnt;
    }

    public static boolean[] setVowels(){
        boolean[] vowels = new boolean[123];
        vowels['A'] = true;
        vowels['E'] = true;
        vowels['I'] = true;
        vowels['O'] = true;
        vowels['U'] = true;
        vowels['a'] = true;
        vowels['e'] = true;
        vowels['i'] = true;
        vowels['o'] = true;
        vowels['u'] = true;
        return vowels;
    }
}
