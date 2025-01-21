package com.example.leetcodetasks.easy.String;

public class ArrayFreq {

    public static void main(String[] args) {
        System.out.println(countMaxFrequency("hello")); // 2 ('ll')
    }

    public static int countMaxFrequency(String s) {
        int[] freq = new int[26];
        for(char c: s.toCharArray()) {
            freq[c - 'a']++;
        }
        int max = Integer.MIN_VALUE;
        for(int fq: freq) {
            max = Math.max(max, fq);
        }
        return max;
    }
}
