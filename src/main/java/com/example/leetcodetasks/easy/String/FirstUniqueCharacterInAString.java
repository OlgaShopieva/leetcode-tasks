package com.example.leetcodetasks.easy.String;

import java.util.HashMap;
import java.util.Map;

/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1
 */
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s){
        int index;

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);
            int frequency = map.getOrDefault(letter, 0);
            map.put(letter, (frequency + 1));
        }

        for(int j = 0; j < s.length(); j++){
            if (map.get(s.charAt(j)) == 1){
                index = j;
                return index;
            }

        }
        index = -1;
        return index;
    }

}
