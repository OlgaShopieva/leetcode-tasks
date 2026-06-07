package com.example.leetcodetasks.String.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:
 * Characters ('a' to 'i') are represented by ('1' to '9') respectively.
 * Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
 * Return the string formed after mapping.
 * The test cases are generated so that a unique mapping will always exist.
 * Example 1:
 * Input: s = "10#11#12"
 * Output: "jkab"
 * Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
 * Example 2:
 * Input: s = "1326#"
 * Output: "acz"
 */
public class FreqAlphabets {

    public static void main(String[] args) {
        String s = "1326#";
        System.out.println(freqAlphabets(s));
    }

    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i >=0; i--) {
            int num = 0;
            if (s.charAt(i) == '#') {
                num += (s.charAt(i-2) - '0') * 10;
                num += (s.charAt(i-1) - '0');
                i -=2;
            }
            else{
                num = s.charAt(i) - '0';
            }
            sb.append((char) (num + 96));

        }
        return sb.reverse().toString();
    }


    private static Map<Integer, Character> fillAtoImap() {
        Map<Integer, Character> map = new HashMap<>();
        map.put(1, 'a');
        map.put(2, 'b');
        map.put(3, 'c');
        map.put(4, 'd');
        map.put(5, 'e');
        map.put(6, 'f');
        map.put(7, 'g');
        map.put(8, 'h');
        map.put(9, 'i');
        return map;
    }

    private static Map<String, Character> fillJtoZmap() {
        Map<String, Character> map = new HashMap<>();
        map.put("10#", 'j');
        map.put("11#", 'k');
        map.put("12#", 'l');
        map.put("13#", 'm');
        map.put("14#", 'n');
        map.put("15#", 'o');
        map.put("16#", 'p');
        map.put("17#", 'q');
        map.put("18#", 'r');
        map.put("19#", 's');
        map.put("20#", 't');
        map.put("21#", 'u');
        map.put("22#", 'v');
        map.put("23#", 'w');
        map.put("24#", 'x');
        map.put("25#", 'y');
        map.put("26#", 'z');
        return map;
    }
}
