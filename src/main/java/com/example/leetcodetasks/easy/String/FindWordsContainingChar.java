package com.example.leetcodetasks.easy.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * You are given a 0-indexed array of strings words and a character x.
 * Return an array of indices representing the words that contain the character x.
 * Note that the returned array may be in any order.
 * Example 1:
 * Input: words = ["leet","code"], x = "e"
 * Output: [0,1]
 * Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.
 * Example 2:
 * Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
 * Output: [0,2]
 * Explanation: "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.
 */
public class FindWordsContainingChar {

    public static void main(String[] args) {
       String[] words = new String[]{"abc","bcd","aaaa","cbc"};
       char x = 'a';
        System.out.println(findWordsContaining(words, x));

    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indices = new ArrayList<>();
        for(int i = 0; i < words.length; i++) {
            if(words[i].indexOf(x) != -1) {
                indices.add(i);
            }
        }
        return indices;
    }
}
