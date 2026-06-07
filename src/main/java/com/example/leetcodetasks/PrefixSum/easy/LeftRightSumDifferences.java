package com.example.leetcodetasks.PrefixSum.easy;

import java.util.Arrays;

/**
 * You are given a 0-indexed integer array nums of size n.
 * Define two arrays leftSum and rightSum where:
 * leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
 * rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
 * Return an integer array answer of size n where answer[i] = |leftSum[i] - rightSum[i]|.
 * Example 1:
 * Input: nums = [10,4,8,3]
 * Output: [15,1,11,22]
 * Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
 * The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
 */
public class LeftRightSumDifferences {

    //method 1
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int [] leftSum = new int[n];
        int [] rightSum = new int[n];
        int[] answer = new int[n];

        //left pass
        int leftCount = 0;
        for (int i = 0; i < n; i++) {
            leftSum[i] = leftCount;
            leftCount += nums[i];
        }

        //right pass
        int rightCount = 0;
        for(int i = n - 1; i >= 0; i--) {
            rightSum[i] = rightCount;
            rightCount += nums[i];
        }

        for (int i = 0; i < n; i++){
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return answer;
    }

    //prefix sum pattern
    public static int[] leftRightDifference1(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            int rightSum = total - leftSum - nums[i];
            answer[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }

        return answer;
    }
}
