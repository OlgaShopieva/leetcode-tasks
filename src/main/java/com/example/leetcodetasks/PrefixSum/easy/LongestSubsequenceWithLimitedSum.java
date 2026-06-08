package com.example.leetcodetasks.PrefixSum.easy;

import java.util.Arrays;

/**
 * You are given an integer array nums of length n, and an integer array queries of length m.
 * Return an array answer of length m where answer[i] is the maximum size of a subsequence that you can take
 * from nums such that the sum of its elements is less than or equal to queries[i].
 * A subsequence is an array that can be derived from another array by deleting some or no elements
 * without changing the order of the remaining elements.
 *
 * Example 1:
 * Input: nums = [4,5,2,1], queries = [3,10,21]
 * Output: [2,3,4]
 * Explanation: We answer the queries as follows:
 * - The subsequence [2,1] has a sum less than or equal to 3.
 * It can be proven that 2 is the maximum size of such a subsequence, so answer[0] = 2.
 * - The subsequence [4,5,1] has a sum less than or equal to 10.
 * It can be proven that 3 is the maximum size of such a subsequence, so answer[1] = 3.
 * - The subsequence [4,5,2,1] has a sum less than or equal to 21.
 * It can be proven that 4 is the maximum size of such a subsequence, so answer[2] = 4.
 * Example 2:
 * Input: nums = [2,3,4,5], queries = [1]
 * Output: [0]
 * Explanation: The empty subsequence is the only subsequence that has a sum less than or equal to 1, so answer[0] = 0.
 */
public class LongestSubsequenceWithLimitedSum {

    public static void main(String[] args) {
        int[] nums = new int[]{4,5,2,1}, queries = {3,10,21};
        System.out.println(Arrays.toString(answerQueries(nums, queries)));
    }

    public static int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length;
        int m = queries.length;

        // Sorting array nums
        Arrays.sort(nums);

        // Taking prefix sum
        if(n > 1) {
            for (int i = 1; i < n; i++) {
                nums[i] += nums[i - 1];
            }
        }

        int[] ans = new int[m];
        for(int i = 0; i < m; i++) {
            int q = queries[i];

            // performing binary search for each query
            int low = 0, high = n - 1;
            while(low <= high) {
                int mid = low + (high - low) / 2;
                if(nums[mid] == q) {
                    ans[i] = mid + 1;
                    break;
                }
                else if(nums[mid] < q) {
                    ans[i] = mid + 1;
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }

        return ans;
    }
}
