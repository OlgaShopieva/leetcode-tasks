package com.example.leetcodetasks.String.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given an array of strings words, return the words that can be typed using letters of the alphabet
 * on only one row of American keyboard like the image below.
 * Note that the strings are case-insensitive, both lowercased and uppercased of the same letter are treated
 * as if they are at the same row.
 * In the American keyboard:
 * the first row consists of the characters "qwertyuiop",
 * the second row consists of the characters "asdfghjkl", and
 * the third row consists of the characters "zxcvbnm".
 */
public class KeyboardRow {


    public static String[] findWords(String[] words) {
        Set<Character> row1 = new HashSet<>();
        Set<Character> row2 = new HashSet<>();
        Set<Character> row3 = new HashSet<>();

        // Заполняем первую строку
        for (char c : "qwertyuiop".toCharArray()) {
            row1.add(c);
        }

        // Заполняем вторую строку
        for (char c : "asdfghjkl".toCharArray()) {
            row2.add(c);
        }

        // Заполняем третью строку
        for (char c : "zxcvbnm".toCharArray()) {
            row3.add(c);
        }

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String lowerWord = word.toLowerCase();
            boolean inRow1 = true;
            boolean inRow2 = true;
            boolean inRow3 = true;

            for (char c : lowerWord.toCharArray()) {
                if (!row1.contains(c)) {
                    inRow1 = false;
                }
                if (!row2.contains(c)) {
                    inRow2 = false;
                }
                if (!row3.contains(c)) {
                    inRow3 = false;
                }
            }

            if (inRow1 || inRow2 || inRow3) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }
}
