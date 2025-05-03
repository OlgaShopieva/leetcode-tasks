package com.example.leetcodetasks.easy.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given a string of English letters s, return the greatest English letter which occurs as both a lowercase
 * and uppercase letter in s. The returned letter should be in uppercase. If no such letter exists, return an empty string.
 * An English letter b is greater than another letter a if b appears after a in the English alphabet.
 * Example 1:
 * Input: s = "lEeTcOdE"
 * Output: "E"
 * Explanation:
 * The letter 'E' is the only letter to appear in both lower and upper case.
 */
public class GreatestEnglishLetters {

    public static void main(String[] args) {
        String s = "lEeTcOdE";
        System.out.println(greatestLetter(s));
    }

    public static String greatestLetter(String s) {
        for(char c = 'Z'; c >= 'A'; c--){
            if(s.indexOf(c) != -1 && s.indexOf(Character.toLowerCase(c)) != -1){
                return c+"";
            }
        }
        return "";
        //method2
//        Set<Character> set = new HashSet<>();
//        for(char ch: s.toCharArray()) {
//            set.add(ch);
//        }
//
//        for (char c = 'Z'; c >= 'A'; c--) {
//            if(set.contains(c) && set.contains(Character.toLowerCase(c))) {
//                return String.valueOf(c);
//            }
//        }
//        return "";
    }
}
