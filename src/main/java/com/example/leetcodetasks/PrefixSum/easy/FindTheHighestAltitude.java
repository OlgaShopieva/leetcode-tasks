package com.example.leetcodetasks.PrefixSum.easy;

/**
 * There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
 * The biker starts his trip on point 0 with altitude equal 0.
 * You are given an integer array gain of length n where gain[i] is the net gain in altitude
 * between points i and i + 1 for all (0 <= i < n).
 * Return the highest altitude of a point.
 *
 * Example 1:
 * Input: gain = [-5,1,5,0,-7]
 * Output: 1
 * Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
 */
public class FindTheHighestAltitude {

    public static void main(String[] args) {
        int[] gain = new int[]{-5,1,5,0,-7};
        System.out.println(largestAltitude2(gain));
    }

    //method 1 with Prefix Sum
    public static int largestAltitude(int[] gain) {
        int[] altitude = prefix(gain);
        int max = 0;
        for (int j : altitude) {
            if (j > max) {
                max = j;
            }
        }
        return max;

    }

    private static int[] prefix(int[] arr) {
        int[] prefix = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }
        return prefix;
    }

    //method 2, one loop
    public static int largestAltitude2(int[] gain) {
        int altitude = 0;
        int max = 0;
        for (int j : gain) {
            altitude = altitude + j;
            if (altitude > max) {
                max = altitude;
            }

        }
        return max;
    }
}
