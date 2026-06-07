package com.example.leetcodetasks.String.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * A cell (r, c) of an excel sheet is represented as a string "<col><row>" where:
 * <col> denotes the column number c of the cell. It is represented by alphabetical letters.
 * For example, the 1st column is denoted by 'A', the 2nd by 'B', the 3rd by 'C', and so on.
 * <row> is the row number r of the cell. The rth row is represented by the integer r.
 * You are given a string s in the format "<col1><row1>:<col2><row2>", where <col1> represents the column c1, <row1>
 *     represents the row r1, <col2> represents the column c2, and <row2> represents the row r2, such that r1 <= r2 and c1 <= c2.
 * Return the list of cells (x, y) such that r1 <= x <= r2 and c1 <= y <= c2.
 * The cells should be represented as strings in the format mentioned above and be sorted in non-decreasing order first
 * by columns and then by rows.
 * Example 1:
 * Input: s = "K1:L2"
 * Output: ["K1","K2","L1","L2"]
 * Explanation:
 * The above diagram shows the cells which should be present in the list.
 * The red arrows denote the order in which the cells should be presented.
 */
public class CellsInRange {
    public static void main(String[] args) {
        String s = "A1:F2";
        System.out.println(cellsInRange(s));

    }
    public static List<String> cellsInRange(String s) {
        List<String> result = new ArrayList<>();
        char startCell = s.charAt(0);
        char endCell = s.charAt(3);
        char startRow = s.charAt(1);
        char endRow = s.charAt(4);
        for(char i = startCell; i <= endCell; i++) {
            for(char j = startRow; j <= endRow; j++) {
                result.add(new String(new char[]{i,j}));
            }
        }
        return result;
    }
}
