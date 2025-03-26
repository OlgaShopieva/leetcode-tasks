package com.example.leetcodetasks.easy.String;

import java.util.*;

/**
 * A sentence is a string of single-space separated words where each word consists only of lowercase letters.
 * A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
 * Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.
 * Example 1:
 * Input: s1 = "this apple is sweet", s2 = "this apple is sour"
 * Output: ["sweet","sour"]
 * Explanation:
 * The word "sweet" appears only in s1, while the word "sour" appears only in s2.
 * Example 2:
 * Input: s1 = "apple apple", s2 = "banana"
 * Output: ["banana"]
 */
public class UncommonFromSentence {
    public static void main(String[] args) {
       String s1 = "apple apple", s2 = "banana";
        System.out.println(Arrays.toString(uncommonFromSentences(s1, s2)));
    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        String[] split1 = s1.split(" ");
        String[] split2 = s2.split(" ");

        Map<String, Integer> map = new HashMap<>();

        // Обрабатываем первое предложение
        for (String word : split1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Обрабатываем второе предложение
        for (String word : split2) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Удаляем слова, которые встречаются более одного раза
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }

        return result.toArray(new String[0]);
    }
}
