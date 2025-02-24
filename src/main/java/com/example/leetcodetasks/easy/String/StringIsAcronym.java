package com.example.leetcodetasks.easy.String;

import java.util.List;

/**
 * Given an array of strings words and a string s, determine if s is an acronym of words.
 * The string s is considered an acronym of words if it can be formed by concatenating the first character of each string in words in order. For example, "ab" can be formed from ["apple", "banana"], but it can't be formed from ["bear", "aardvark"].
 * Return true if s is an acronym of words, and false otherwise.
 * Example 1:
 * Input: words = ["alice","bob","charlie"], s = "abc"
 * Output: true
 * Explanation: The first character in the words "alice", "bob", and "charlie" are 'a', 'b', and 'c', respectively. Hence, s = "abc" is the acronym.
 * Example 2:
 * Input: words = ["an","apple"], s = "a"
 * Output: false
 * Explanation: The first character in the words "an" and "apple" are 'a' and 'a', respectively.
 * The acronym formed by concatenating these characters is "aa".
 * Hence, s = "a" is not the acronym.
 */
public class StringIsAcronym {

    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();
        for(String str: words) {
            sb.append(str.charAt(0));
        }
        return sb.toString().equals(s);
    }
}
