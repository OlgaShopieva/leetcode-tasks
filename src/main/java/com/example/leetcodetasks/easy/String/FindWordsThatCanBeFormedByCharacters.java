package com.example.leetcodetasks.easy.String;

/**
 * Input: words = ["cat","bt","hat","tree"], chars = "atach"
 * Output: 6
 * Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
 */
public class FindWordsThatCanBeFormedByCharacters {

    public static void main(String[] args) {
        String[] words = new String[]{"cat","bt","hat","tree"};
        String chars = "atach";
        System.out.println(countCharacters(words, chars));
    }

    public static int countCharacters(String[] words, String chars) {
        int[] counts = new int[26];
        // Step 1: Initialize Character Counts Array
        for(int i=0;i<chars.length();i++)
        {
            counts[chars.charAt(i)-'a']++;
        }
        int res =0 ;
        // Step 3: Check Words
        for(String s : words)
        {
            if(canForm(s,counts))
                // Step 4: Calculate Lengths
                res+=s.length();
        }
        return res;
    }

    static boolean canForm(String word, int[] counts)
    {
        int[] c = new int[26];
        // Step 2: Update Counts Array
        for(int i =0;i<word.length();i++)
        {
            int x = word.charAt(i)-'a';
            c[x]++;
            if(c[x] > counts[x])
                return false;
        }
        return true;
    }
}
