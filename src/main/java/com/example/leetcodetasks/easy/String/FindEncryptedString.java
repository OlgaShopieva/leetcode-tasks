package com.example.leetcodetasks.easy.String;

/**
 * You are given a string s and an integer k. Encrypt the string using the following algorithm:
 * For each character c in s, replace c with the kth character after c in the string (in a cyclic manner).
 * Return the encrypted string.
 * Example 1:
 * Input: s = "dart", k = 3
 * Output: "tdar"
 * Explanation:
 * For i = 0, the 3rd character after 'd' is 't'.
 * For i = 1, the 3rd character after 'a' is 'd'.
 * For i = 2, the 3rd character after 'r' is 'a'.
 * For i = 3, the 3rd character after 't' is 'r'.
 */
public class FindEncryptedString {
    public static void main(String[] args) {
        String s = "dart"; int k = 3;
        System.out.println(getEncryptedString(s, k));
    }

    public static String getEncryptedString(String s, int k) {
        int n = s.length();
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < n; i++) {
            // Вычисляем индекс заменяющего символа
            int newIndex = (i + k) % n;
            // Получаем символ по новому индексу и добавляем в результат
            encrypted.append(s.charAt(newIndex));
        }

        return encrypted.toString();

    }
}
