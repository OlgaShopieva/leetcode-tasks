package com.example.leetcodetasks.easy.String;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * You are given a 0-indexed string array words.
 * Two strings are similar if they consist of the same characters.
 * For example, "abca" and "cba" are similar since both consist of characters 'a', 'b', and 'c'.
 * However, "abacba" and "bcfd" are not similar since they do not consist of the same characters.
 * Return the number of pairs (i, j) such that 0 <= i < j <= word.length - 1 and the two strings words[i] and words[j] are similar.
 * Example 1:
 * Input: words = ["aba","aabb","abcd","bac","aabc"]
 * Output: 2
 * Explanation: There are 2 pairs that satisfy the conditions:
 * - i = 0 and j = 1 : both words[0] and words[1] only consist of characters 'a' and 'b'.
 * - i = 3 and j = 4 : both words[3] and words[4] only consist of characters 'a', 'b', and 'c'.
 */
public class SimilarPairs {

    public  int similarPairs(String[] words) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        int count = 0;
        int l = words.length;
        for(int i = 0; i <= l - 2; i++) {
           for(int j = i+1; j <= l - 1; j++) {
               set1 = words[i].chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
               set2 = words[j].chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
               if(set1.equals(set2)) {
                   count++;
               }
           }
        }
        return count;
    }
}
