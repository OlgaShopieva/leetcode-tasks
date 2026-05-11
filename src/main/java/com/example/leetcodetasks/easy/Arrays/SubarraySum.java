package com.example.leetcodetasks.easy.Arrays;


import static java.lang.Math.max;

/**
 * You are given an integer array nums of size n. For each index i where 0 <= i < n, define a subarray nums[start ... i] where start = max(0, i - nums[i]).
 * Return the total sum of all elements from the subarray defined for each index in the array.
 *
 * Example 1:
 * Input: nums = [2,3,1]
 * Output: 11
 * Explanation:
 * i	Subarray	Sum
 * 0	nums[0] = [2]	2
 * 1	nums[0 ... 1] = [2, 3]	5
 * 2	nums[1 ... 2] = [3, 1]	4
 * Total Sum	 	11
 * The total sum is 11. Hence, 11 is the output.
 */
public class SubarraySum {
    public static void main(String[] args) {
        int nums[] = new int[]{3,1,1,2};
        System.out.println(getSubArraySum(nums));
    }

    //method 1
    private static int getSubArraySum(int[] nums) {
        int total = 0;
        for(int i = 0; i < nums.length; i++) {
            int start = max(0, i - nums[i]);
            for(int j = start; j <= i; j++) {
                total += nums[j];
            }
        }
        return total;
    }

    //method2 with prefix sum
    private static int subarraySum(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int start = Math.max(0, i - nums[i]);
            ans += prefix[i + 1] - prefix[start];
        }

        return ans;
    }
}
