package com.example.leetcodetasks.easy.String;

/**
 * The letter value of a letter is its position in the alphabet starting from 0 (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, etc.).
 *
 * The numerical value of some string of lowercase English letters s is the concatenation of the letter values
 * of each letter in s, which is then converted into an integer.
 * For example, if s = "acb", we concatenate each letter's letter value, resulting in "021".
 * After converting it, we get 21.
 * You are given three strings firstWord, secondWord, and targetWord,
 * each consisting of lowercase English letters 'a' through 'j' inclusive.
 * Return true if the summation of the numerical values of firstWord and secondWord equals
 * the numerical value of targetWord, or false otherwise.
 * Example 1:
 * * Input: firstWord = "acb", secondWord = "cba", targetWord = "cdb"
 * Output: true
 * Explanation:
 * The numerical value of firstWord is "acb" -> "021" -> 21.
 * The numerical value of secondWord is "cba" -> "210" -> 210.
 * The numerical value of targetWord is "cdb" -> "231" -> 231.
 * We return true because 21 + 210 == 231.
 * Example 2:
 * Input: firstWord = "aaa", secondWord = "a", targetWord = "aab"
 * Output: false
 * Explanation:
 * The numerical value of firstWord is "aaa" -> "000" -> 0.
 * The numerical value of secondWord is "a" -> "0" -> 0.
 * The numerical value of targetWord is "aab" -> "001" -> 1.
 * We return false because 0 + 0 != 1.
 */
public class CheckIfSumEqual {
    public static void main(String[] args) {
        String firstWord = "acb", secondWord = "cba", targetWord = "cdb";
        System.out.println(isSumEqual(firstWord, secondWord, targetWord));
    }

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int[] positionMap = new int[128];

        for (char c = 'a'; c <= 'j'; c++) {
            positionMap[c] = c - 'a';
        }

        StringBuilder sb1 = new StringBuilder();
        for(char ch: firstWord.toCharArray()) {
            sb1.append(positionMap[ch]);
        }
        int firstNum = Integer.parseInt(sb1.toString());

        StringBuilder sb2 = new StringBuilder();
        for(char ch: secondWord.toCharArray()) {
            sb2.append(positionMap[ch]);
        }
        int secondNum = Integer.parseInt(sb2.toString());

        StringBuilder sb3 = new StringBuilder();
        for(char ch: targetWord.toCharArray()) {
            sb3.append(positionMap[ch]);
        }
        int targetNum = Integer.parseInt(sb3.toString());

        return firstNum + secondNum == targetNum;

    }
}
