package com.example.leetcodetasks.PrefixSum.easy;

/*
Given a positive integer n, find the pivot integer x such that:
The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
Return the pivot integer x. If no such integer exists, return -1.
It is guaranteed that there will be at most one pivot index for the given input.

Example 1:
Input: n = 8
Output: 6
Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.
 */
public class FindThePivotInteger {

    // method 1 Prefix Sum
    public static int pivotInteger(int n) {
        int[] arrPrefix = prefixSum(n);
        for (int i = 1; i < arrPrefix.length; i++) {
            int x = arrPrefix[i];
            int sum = arrPrefix[arrPrefix.length - 1] - arrPrefix[i - 1];
            if(x == sum) {
                return i;
            }
        }
        return -1;
    }


    private static int[] prefixSum(int n) {
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i-1] + i;
        }
        //[0, 1, 3, 6, 10, 15, 21, 28, 36]
        return arr;
    }

    // method 2 Math solution
    public static int pivotInteger2(int n) {
        int total=(n*(n+1))/2;
        int pivot=(int)Math.sqrt(total);
        if(pivot*pivot == total)
        {
            return pivot;
        }
        return -1;
    }
}
