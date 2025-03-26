package com.example.leetcodetasks.easy.String;

/**
 * You are given a string moves of length n consisting only of characters 'L', 'R', and '_'.
 * The string represents your movement on a number line starting from the origin 0.
 * In the ith move, you can choose one of the following directions:
 * move to the left if moves[i] = 'L' or moves[i] = '_'
 * move to the right if moves[i] = 'R' or moves[i] = '_'
 * Return the distance from the origin of the furthest point you can get to after n moves.
 * Example 1:
 * Input: moves = "L_RL__R"
 * Output: 3
 * Explanation: The furthest point we can reach from the origin 0 is point -3 through the following sequence of moves "LLRLLLR".
 * Example 2:
 * Input: moves = "_R__LL_"
 * Output: 5
 * Explanation: The furthest point we can reach from the origin 0 is point -5 through the following sequence of moves "LRLLLLL".
 */
public class FurthestPointFromOrigin {

    public static void main(String[] args) {
        String moves = "_R__LL_";
        System.out.println(furthestDistanceFromOrigin(moves));
    }

    public static int furthestDistanceFromOrigin(String moves) {
        int countL = 0;
        int countR = 0;
        for(char ch: moves.toCharArray()) {
            if(ch == 'L') {
                countL++;
            } else countR++;
        }

        String fullString;
        if(countL > countR) {
            fullString = moves.replace('_', 'L');
        } else fullString = moves.replace('_', 'R');

        countR = 0;
        countL = 0;
        for(char ch: fullString.toCharArray()) {
            if(ch == 'L') {
                countL++;
            } else countR++;
        }

        return Math.abs(countR - countL);
    }
}
