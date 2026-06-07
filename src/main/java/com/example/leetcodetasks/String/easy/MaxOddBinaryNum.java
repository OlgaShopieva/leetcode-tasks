package com.example.leetcodetasks.String.easy;

/**
 * You are given a binary string s that contains at least one '1'.
 * You have to rearrange the bits in such a way that the resulting binary number is the maximum odd binary number
 * that can be created from this combination.
 * Return a string representing the maximum odd binary number that can be created from the given combination.
 * Note that the resulting string can have leading zeros.
 * Example 1:
 * Input: s = "010"
 * Output: "001"
 * Explanation: Because there is just one '1', it must be in the last position. So the answer is "001".
 */
public class MaxOddBinaryNum {

    public String maximumOddBinaryNumber(String s) {
        int countOnes = 0;
        int countZeros = 0;
        int n = s.length();
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == '1') {
                countOnes++;
            } else {
                countZeros++;
            }
        }

        StringBuilder sb = new StringBuilder();
        int leadingOnes = countOnes - 1;
        if(leadingOnes != 0) {
            for(int i = 0; i < leadingOnes; i++) {
                sb.append('1');
            }
        }
        for(int i = 0; i < countZeros; i++) {
            sb.append('0');
        }
        sb.append('1');
        return sb.toString();
    }

}
