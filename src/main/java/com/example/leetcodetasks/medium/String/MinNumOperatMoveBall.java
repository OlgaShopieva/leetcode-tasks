package com.example.leetcodetasks.medium.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * You have n boxes. You are given a binary string boxes of length n, where boxes[i] is '0' if the ith box is empty,
 * and '1' if it contains one ball.
 * In one operation, you can move one ball from a box to an adjacent box. Box i is adjacent to box j if abs(i - j) == 1.
 * Note that after doing so, there may be more than one ball in some boxes.
 * Return an array answer of size n, where answer[i] is the minimum number of operations needed to move all the balls
 * to the ith box.
 * Each answer[i] is calculated considering the initial state of the boxes.
 *
 * Example 1:
 *
 * Input: boxes = "110"
 * Output: [1,1,3]
 * Explanation: The answer for each box is as follows:
 * 1) First box: you will have to move one ball from the second box to the first box in one operation.
 * 2) Second box: you will have to move one ball from the first box to the second box in one operation.
 * 3) Third box: you will have to move one ball from the first box to the third box in two operations, and move one ball
 * from the second box to the third box in one operation.
 * Example 2:
 *
 * Input: boxes = "001011"
 * Output: [11,8,5,4,3,4]
 */
public class MinNumOperatMoveBall {

    public static void main(String[] args) {
        String boxes = "110";
        System.out.println(Arrays.toString(minOperations(boxes)));
    }

    //method1 slow
    public static int[] minOperations(String boxes) {
        char[] strArray = boxes.toCharArray();
        int[]source = getSource(strArray);
        List<Integer> res_list = new ArrayList<>();
        for(int i = 0; i< strArray.length; i++) {
            int currSum = 0;
            for (int k : source) {
                currSum += Math.abs(k - i);
            }
            res_list.add(currSum);
        }
        int[] res = new int[res_list.size()];
        for (int i = 0; i < res_list.size(); i++) {
            res[i] = res_list.get(i);
        }
        return res;
    }

    private static int[] getSource(char[] array) {
        List<Integer> source = new ArrayList<>();
        for(int i = 0; i< array.length; i++) {
            if(array[i] == '1') {
                source.add(i);
            }
        }
        int[] res = new int[source.size()];
        for (int i = 0; i < source.size(); i++) {
            res[i] = source.get(i);
        }
        return res;
    }

    //method2

    public static int[] minOperations2(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];

        for(int i = 0; i < n; i++) {
            int operations = 0;
            for(int j = 0; j < n; j++) {
                if(boxes.charAt(j) == '1') {
                    operations += Math.abs(i -j);
                }
            }
            answer[i] = operations;
        }
        return answer;
    }

    //Prefix Sum method
    public int[] minOperations3(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];

        int ballsToLeft = 0, movesToLeft = 0;
        int ballsToRight = 0, movesToRight = 0;

        // Single pass: calculate moves from both left and right
        for (int i = 0; i < n; i++) {
            // Left pass
            answer[i] += movesToLeft;
            ballsToLeft += Character.getNumericValue(boxes.charAt(i));
            movesToLeft += ballsToLeft;

            // Right pass
            int j = n - 1 - i;
            answer[j] += movesToRight;
            ballsToRight += Character.getNumericValue(boxes.charAt(j));
            movesToRight += ballsToRight;
        }

        return answer;
    }
}
