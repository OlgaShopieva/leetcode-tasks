package com.example.leetcodetasks.easy.String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringMatching {
    public static void main(String[] args) {
        String[] words = new String[]{"leetcoder","leetcode","od","hamlet","am"};
        System.out.println(stringMatching(words));
    }

    public static List<String> stringMatching(String[] words) {
        //method1
//        Set<String> result = new HashSet<>();
//
//        for (String s : words) {
//            for (String word : words) {
//                if (s.contains(word) && !s.equals(word)) {
//                    result.add(word);
//                }
//            }
//        }
//        return result.stream().toList();

        //method2
        List<String> res = new ArrayList<>(words.length);
        int i = 0;
        for (String s : words) {
            if (hasStr(s, words, i)) res.add(s);
            i++;
        }
        return res;
    }
    public static boolean hasStr(String s, String[] arr, int i) {
        int j = 0;
        for (String str : arr) {
            if (j != i && str.indexOf(s) > -1) return true;
            j++;
        }
        return false;
    }
}
