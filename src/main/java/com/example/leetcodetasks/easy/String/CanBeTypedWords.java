package com.example.leetcodetasks.easy.String;

/**
 * There is a malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly.
 * Given a string text of words separated by a single space (no leading or trailing spaces) and a string brokenLetters
 * of all distinct letter keys that are broken, return the number of words in text you can fully type using this keyboard.
 * Example 1:
 * Input: text = "hello world", brokenLetters = "ad"
 * Output: 1
 * Explanation: We cannot type "world" because the 'd' key is broken.
 * Example 2:
 * Input: text = "leet code", brokenLetters = "lt"
 * Output: 1
 * Explanation: We cannot type "leet" because the 'l' and 't' keys are broken.
 */
public class CanBeTypedWords {
    public static void main(String[] args) {
        String text = "a b c d e", brokenLetters = "abcde";
        System.out.println(canBeTypedWords(text, brokenLetters));
    }

    public static int canBeTypedWords(String text, String brokenLetters) {
        boolean[] s = new boolean[26];
        for (char c : brokenLetters.toCharArray()) {
            s[c - 'a'] = true;
        }
        int ans = 0;
        for (String w : text.split(" ")) {
            for (char c : w.toCharArray()) {
                if (s[c - 'a']) {
                    --ans;
                    break;
                }
            }
            ++ans;
        }
        return ans;
//        int count = 0;
//        boolean hasLetter = false;
//        String[] words = text.split(" ");
//        for(String word: words) {
//            for (char ch : brokenLetters.toCharArray()) {
//                hasLetter = word.contains(String.valueOf(ch));
//                if(hasLetter) break;
//            }
//            if(!hasLetter) count++;
//        }
//        return count;
    }
}
