package com.example.leetcodetasks.easy.Arrays;

/*
Given a binary array nums, return the maximum number of consecutive 1's in the array.

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 */
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] array = {1, 0, 1, 1, 1, 0};
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        maxConsecutiveOnes.findMaxConsecutiveOnes(array);
        System.out.println(maxConsecutiveOnes.findMaxConsecutiveOnes(array));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] == 1){
                count++;
                if(count > max){
                    max = count;
                }
            }
            else{
                count = 0;
            }
        }
        return max;

    }
}
