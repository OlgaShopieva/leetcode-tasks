package com.example.leetcodetasks.easy.Arrays;
/*
Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]


Example 1:
Input: arr = [2,1]
Output: false
 */
public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        int peak = 0;

        for(int i = 1; i < arr.length - 1; i++)
        {
            int prev = arr[i -1];
            int curr = arr [i];
            int next = arr[i + 1];

            if(prev == curr || curr == next)
                return false;
            if(prev > curr && curr < next)
                return false;
            if(prev < curr && curr > next)
            {
                peak++;
                if(peak > 1)
                    return false;
            }

        }
        return peak == 1;

    }
}
