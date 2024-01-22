package com.example.leetcodetasks.easy.Math;
/*
Given an integer x, return true if x is a
palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(x));
    }


    public boolean isPalindrome(int x) {
        if( x < 0) return false;

        long reversed = 0;
        long temp = x;
        while(temp != 0){
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return (reversed == x);

    }
}
