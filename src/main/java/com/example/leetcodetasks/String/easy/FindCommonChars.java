package com.example.leetcodetasks.String.easy;
/**
 * Given a string array words, return an array of all characters
 * that show up in all strings within the words (including duplicates).
 * You may return the answer in any order.
 * Example 1:
 * Input: words = ["bella","label","roller"]
 * Output: ["e","l","l"]
 * Example 2:
 * Input: words = ["cool","lock","cook"]
 * Output: ["c","o"]
 */

import java.util.ArrayList;
import java.util.List;

public class FindCommonChars {
    public static void main(String[] args) {
        String[] words = new String[]{"bella","label","roller"};
        System.out.println(commonChars(words));
    }

    public static List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        if (words == null || words.length == 0) {
            return result;
        }

        int[] common = new int[26];
        for (char c : words[0].toCharArray()) {
            common[c - 'a']++;
        }

        for (int i = 1; i < words.length; i++) {
            int[] current = new int[26];
            for (char c : words[i].toCharArray()) {
                current[c - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                common[j] = Math.min(common[j], current[j]);
            }
        }

        for (int j = 0; j < 26; j++) {
            if (common[j] > 0) {
                char c = (char) ('a' + j);
                for (int k = 0; k < common[j]; k++) {
                    result.add(String.valueOf(c));
                }
            }
        }
        return result;
    }
}
