package com.example.leetcodetasks.easy.String;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented
 * as a string s of length n where:
 * s[i] == 'I' if perm[i] < perm[i + 1], and
 * s[i] == 'D' if perm[i] > perm[i + 1].
 * Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm,
 * return any of them.
 * Example 1:
 * Input: s = "IDID"
 * Output: [0,4,1,3,2]
 * Example 2:
 * Input: s = "III"
 * Output: [0,1,2,3]
 */
public class DIStringMatch {
    public static void main(String[] args) {
        String s = "DDD";
        System.out.println(Arrays.toString(diStringMatch(s)));
    }

    public static int[] diStringMatch(String s) {
        int[] perm = new int[s.length() + 1];
        int head = 0;
        int tail = s.length();
        int index = 0;
        for(char ch: s.toCharArray()) {
            if(ch == 'D') {
                perm[index] = tail;
                tail--;
                index++;
            } else {
                perm[index] = head;
                head++;
                index++;
            }
        }
        perm[index] = head;
        return perm;
    }
}
