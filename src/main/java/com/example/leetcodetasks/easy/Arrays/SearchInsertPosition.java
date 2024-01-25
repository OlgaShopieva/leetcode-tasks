package com.example.leetcodetasks.easy.Arrays;
/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not,
return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1
 */

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 5};
        System.out.println(searchInsert(array, 4));

    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] < target){
                left = mid + 1;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }
            else {
                return mid;
            }
        }
        return left;
    }
}
