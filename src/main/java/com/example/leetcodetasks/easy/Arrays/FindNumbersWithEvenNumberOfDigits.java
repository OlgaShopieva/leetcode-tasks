package com.example.leetcodetasks.easy.Arrays;
/*
Given an array nums of integers, return how many of them contain an even number of digits.

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.
 */

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        FindNumbersWithEvenNumberOfDigits findNumbersWithEvenNumberOfDigits = new FindNumbersWithEvenNumberOfDigits();
        int[] nums = {355, 2, 4678, 22, 1, 346};
        System.out.println(findNumbersWithEvenNumberOfDigits.findNumbers(nums));

    }
    public int findNumbers(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length; i ++){
            String s = Integer.toString(nums[i]);
            int count = s.length();
            if(count % 2 == 0){
                res ++;
            }
        }
        return res;

    }
}
