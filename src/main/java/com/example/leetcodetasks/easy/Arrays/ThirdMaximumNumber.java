package com.example.leetcodetasks.easy.Arrays;

import java.util.Arrays;
import java.util.HashSet;

/*
Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.



Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
 */
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        HashSet<Integer> set = new HashSet<>();
        for(int i = nums.length - 1; i >= 0; i--){
            set.add(nums[i]);
            if(set.size() == 3){
                return nums[i];
            }

        }
        return nums[nums.length - 1];

    }
}
