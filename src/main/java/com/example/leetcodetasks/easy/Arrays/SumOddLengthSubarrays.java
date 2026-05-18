package com.example.leetcodetasks.easy.Arrays;

public class SumOddLengthSubarrays {

    public static void main(String[] args) {
        int[] arr = new int[]{1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr));
    }

    //method 1 Prefix Sum (O(n²))
    public static int sumOddLengthSubarrays(int[] arr) {
        int answer = 0;
        int[] prefix_arr = prefix(arr);
        for (int left = 0; left < arr.length; left++) {
            for (int right = left; right < arr.length; right++) {
                int length = right - left + 1;
                if(length % 2 != 0) {
                    answer += prefix_arr[right + 1] - prefix_arr[left];
                }
            }
        }
        return answer;
    }

    private static int[] prefix(int[] arr) {
        int[] prefix_arr = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++) {
            prefix_arr[i + 1] = prefix_arr[i] + arr[i];
        }
        return prefix_arr;
    }

    //method 2 (O(n))

}
