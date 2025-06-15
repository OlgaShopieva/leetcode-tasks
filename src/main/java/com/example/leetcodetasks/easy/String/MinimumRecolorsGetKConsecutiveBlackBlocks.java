package com.example.leetcodetasks.easy.String;

public class MinimumRecolorsGetKConsecutiveBlackBlocks {
    public static void main(String[] args) {
        String blocks = "WBBWWBBWBW";
        int k = 7;
        System.out.println(minimumRecolors(blocks, k));
    }

    public static int minimumRecolors(String blocks, int k) {
        if (blocks.length() < k) return 0;

        int minOperations = Integer.MAX_VALUE;
        int currentWhites = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') currentWhites++;
        }

        minOperations = currentWhites;
        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i - k) == 'W') {
                currentWhites--;
            }
            if (blocks.charAt(i) == 'W') {
                currentWhites++;
            }
            if (currentWhites < minOperations) {
                minOperations = currentWhites;
            }
        }

        return minOperations;
    }
}
