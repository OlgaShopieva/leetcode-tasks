package com.example.leetcodetasks.medium.Arrays;

import java.util.*;

public class CountMaxOrSubsets {

    public static void main(String[] args) {
      countMaxOrSubsets(new int[]{3,2,1,5});
    }

    public static int countMaxOrSubsets(int[] nums) {
    //1) get subsets
        List<Integer> combination = new ArrayList<>();
        List<List<Integer>> subsets = new ArrayList<>();
        dfsBacktracking(nums, 0, combination, subsets);

        //2) get bitwise OR
        Map<Integer, Integer> map = new HashMap<>();
        for(List<Integer> subset: subsets) {
            int or = 0;
            for (Integer num: subset) {
                or = or | num;
            }
            map.put(or, map.getOrDefault(or, 0) + 1);
        }

        //3) get MAX freq bitwise OR
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> next : map.entrySet()) {
            max = Math.max(next.getValue(), max);
        }
        return max;
    }


    private static void dfsBacktracking(int[] nums, int currIndex, List<Integer> prevCombination, List<List<Integer>> allCombinations) {

        List<Integer> combinationWithCurrNumber = new ArrayList<>(prevCombination);
        combinationWithCurrNumber.add(nums[currIndex]);
        allCombinations.add(combinationWithCurrNumber);

        if (currIndex == nums.length - 1) {
            return;
        }

        dfsBacktracking(nums, currIndex + 1, combinationWithCurrNumber, allCombinations);
        dfsBacktracking(nums, currIndex + 1, prevCombination, allCombinations);
    }
}
