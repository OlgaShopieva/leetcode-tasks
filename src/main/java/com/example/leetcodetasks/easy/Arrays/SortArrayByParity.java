package com.example.leetcodetasks.easy.Arrays;
/*
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
Return any array that satisfies this condition.



Example 1:
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 */

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int right =  0;
        int left = 0;
        int length = nums.length;

        while(right < length){
            if(nums[right] % 2 == 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }

        return nums;

    }
}
