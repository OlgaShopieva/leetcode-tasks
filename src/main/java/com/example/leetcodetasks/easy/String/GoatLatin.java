package com.example.leetcodetasks.easy.String;

import java.util.HashSet;
import java.util.Set;

public class GoatLatin {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumped over the lazy dog";
        System.out.println(toGoatLatin(sentence));
    }

    public static String toGoatLatin(String sentence) {
        StringBuilder result = new StringBuilder();
        Set<Character> vowels = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u'));
        String ma = "ma";
        StringBuilder a = new StringBuilder();

        String[] words = sentence.split(" ");
        for (String word: words) {
           if(vowels.contains(Character.toLowerCase(word.charAt(0)))) {
               result.append(word);
               result.append(ma);
               a.append('a');
               result.append(a);
               result.append(" ");
           } else {
               result.append(word, 1, word.length());
               result.append(word.charAt(0));
               result.append(ma);
               a.append('a');
               result.append(a);
               result.append(" ");
           }
        }
        return String.valueOf(result.deleteCharAt(result.length() - 1));
    }
}
