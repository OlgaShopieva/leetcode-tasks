package com.example.leetcodetasks.String.easy;

/**
 * You are given coordinates, a string that represents the coordinates of a square of the chessboard.
 * Below is a chessboard for your reference.
 * Return true if the square is white, and false if the square is black.
 * The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first,
 * and the number second.
 * Example 1:
 * Input: coordinates = "a1"
 * Output: false
 * Explanation: From the chessboard above, the square with coordinates "a1" is black, so return false.
 */
public class SquareIsWhite {

    public static void main(String[] args) {
        String s = "a2";
        System.out.println(squareIsWhite(s));
    }

    public static boolean squareIsWhite(String coordinates) {
        return (coordinates.charAt(0) - 'a' + 1) % 2 != (coordinates.charAt(1) - '0') % 2;
    }
}
