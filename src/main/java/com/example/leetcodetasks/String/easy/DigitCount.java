package com.example.leetcodetasks.String.easy;

public class DigitCount {

    public static void main(String[] args) {
        String num = "1210";
        System.out.println(digitCount(num));
    }

    public static boolean digitCount(String num) {
        int n = num.length();

        int[] frequency = new int[10];

        for (int i = 0; i < n; i++) {
            char c = num.charAt(i);
            if (Character.isDigit(c)) {
                int digit = c - '0';
                frequency[digit]++;
            }
        }

        for(int i = 0; i < n; i++) {
            int digit = num.charAt(i) - '0';
            if(frequency[i] != digit) {
                return false;
            }
        }
        return true;
    }
}
