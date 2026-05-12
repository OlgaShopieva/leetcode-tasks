package com.example.leetcodetasks.easy.List;

import java.util.ArrayList;
import java.util.List;

public class CountElemGreaterThan {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(100);
//        nums.add(150);
//        nums.add(300);
        System.out.println(countResponseTimeRegressions(nums));
    }

    public static int countResponseTimeRegressions(List<Integer> responseTimes) {
        int ans = 0;
        long totalSum = 0;

        for (int i = 1; i < responseTimes.size(); i++) {
            totalSum += responseTimes.get(i - 1);

            double avg = (double) totalSum / i;

            if (responseTimes.get(i) > avg) {
                ans++;
            }
        }

        return ans;
    }
}
