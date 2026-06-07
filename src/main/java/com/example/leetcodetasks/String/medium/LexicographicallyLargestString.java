package com.example.leetcodetasks.String.medium;

/**
 * You are given a string word, and an integer numFriends.
 *
 * Alice is organizing a game for her numFriends friends. There are multiple rounds in the game, where in each round:
 * word is split into numFriends non-empty strings, such that no previous round has had the exact same split.
 * All the split words are put into a box.
 * Find the lexicographically largest string from the box after all the rounds are finished.
 * Example 1:
 * Input: word = "dbca", numFriends = 2
 * Output: "dbc"
 * Explanation:
 * All possible splits are:
 * "d" and "bca".
 * "db" and "ca".
 * "dbc" and "a".
 */
public class LexicographicallyLargestString {

    public String answerString(String word, int numFriends) {
        int maxLength = word.length() - (numFriends - 1);
        String maxSubstring = "";

        for (int i = 0; i <= word.length() - maxLength; i++) {
            String current = word.substring(i, i + maxLength);
            if (current.compareTo(maxSubstring) > 0) {
                maxSubstring = current;
            }
        }
        return maxSubstring;
    }
}
