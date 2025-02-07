package com.example.leetcodetasks.easy.String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * You are given the strings key and message, which represent a cipher key and a secret message, respectively.
 * The steps to decode message are as follows:
 * Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
 * Align the substitution table with the regular English alphabet.
 * Each letter in message is then substituted using the table.
 * Spaces ' ' are transformed to themselves.
 * For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet),
 * we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
 * Return the decoded message.
 * Example 1:
 * Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
 * Output: "this is a secret"
 * Explanation: The diagram above shows the substitution table.
 * It is obtained by taking the first appearance of each letter in "the quick brown fox jumps over the lazy dog".
 * Example 2:
 * Input: key = "eljuxhpwnyrdgtqkviszcfmabo", message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb"
 * Output: "the five boxing wizards jump quickly"
 * Explanation: The diagram above shows the substitution table.
 * It is obtained by taking the first appearance of each letter in "eljuxhpwnyrdgtqkviszcfmabo".
 */
public class DecodeMessage {

    public static void main(String[] args) {
      String key = "eljuxhpwnyrdgtqkviszcfmabo", message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
        System.out.println(decodeMessage(key, message));
    }

    public static String decodeMessage(String key, String message) {
        char[] keya = key.toCharArray();
        char[] msga = message.toCharArray();
        char[] arr = new char[26];
        int count = 0, in = 0;
        while (count < 26) {
            if (keya[in] != 32 && arr[keya[in] - 'a'] == '\u0000') {
                arr[keya[in] - 'a'] = (char)('a' + count++);
            }
            in++;
        }

        char[] res = new char[msga.length];
        for (int i = 0; i < res.length; i++)
            if (msga[i] == ' ') res[i] = ' ';
            else res[i] = arr[msga[i] - 'a'];

        return new String(res);
    }
}
