package com.example.leetcodetasks.easy.String;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public static void main(String[] args) {
        String[] words1 = new String[]{"a","ab"}, words2 = {"a","a","a","ab"};
        System.out.println(countWords(words1, words2));
    }

    public static int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        int count = 0;
        for(String word: words1) {
            map1.put(word, map1.getOrDefault(word, 0) + 1);
        }

        for(String word: words2) {
            map2.put(word, map2.getOrDefault(word, 0) + 1);
        }
        for(Map.Entry<String, Integer> entry: map2.entrySet()){
           if(entry.getValue() == 1) {
               if(map1.get(entry.getKey()) != null) {
                   if(map1.get(entry.getKey()) == 1) {
                       count++;
                   }
               }
           }
        }
        return count;
    }
}
