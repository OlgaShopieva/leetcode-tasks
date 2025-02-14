package com.example.leetcodetasks.easy.String;

/**
 * You are given a string title consisting of one or more words separated by a single space,
 * where each word consists of English letters. Capitalize the string by changing the capitalization of each word such that:
 * If the length of the word is 1 or 2 letters, change all letters to lowercase.
 * Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
 * Return the capitalized title.
 * Example 1:
 * Input: title = "capiTalIze tHe titLe"
 * Output: "Capitalize The Title"
 * Explanation:
 * Since all the words have a length of at least 3, the first letter of each word is uppercase,
 * and the remaining letters are lowercase.
 */
public class CapitalizeTitle {
    public static void main(String[] args) {
        String title = "First Letter of Each Word";
        System.out.println(capitalizeTitle(title));
    }

    public static String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word: words) {
            if(word.length() == 1 || word.length() == 2) {
                sb.append(word.toLowerCase());
                sb.append(" ");
            } else {
                sb.append(word.substring(0, 1).toUpperCase());
                sb.append(word.substring(1).toLowerCase());
                sb.append(" ");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
