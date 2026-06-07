package com.example.leetcodetasks.String.easy;

public class CheckTwoChessboards {

    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        if(isWhite(coordinate1) && isWhite(coordinate2)) {
            return true;
        }
        return isBlack(coordinate1) && isBlack(coordinate2);
    }

    private static boolean isWhite(String coordinate) {
        return (coordinate.charAt(0) - 'a' + 1) % 2 != (coordinate.charAt(1) - '0') % 2;
    }

    private static boolean isBlack(String coordinate) {
        return (coordinate.charAt(0) - 'a' + 1) % 2 == (coordinate.charAt(1) - '0') % 2;
    }


}
