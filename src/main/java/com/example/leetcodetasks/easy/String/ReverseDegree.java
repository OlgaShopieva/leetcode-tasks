package com.example.leetcodetasks.easy.String;

import java.util.HashMap;
import java.util.Map;

public class ReverseDegree {
    public static void main(String[] args) {
     String abc = "abc";
        System.out.println(reverseDegree(abc));
    }


    public static int reverseDegree(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch = 'a'; ch <= 'z'; ch++) {
            map.put(ch, 26 - (ch - 'a'));
        }

        int[] product = new int[s.length()];
        int indexProduct = 0;
        int i = 1;
        for(char ch: s.toCharArray()) {
            int indexInReverse = map.get(ch);
            product[indexProduct] = indexInReverse * (i);
            i++;
            indexProduct++;
        }

        int sum = 0;
        for (int num: product) {
            sum+=num;
        }
        return sum;
    }
}
