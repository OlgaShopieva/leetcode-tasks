package com.example.leetcodetasks.String.easy;

/**
 * You are given an array of n strings strs, all of the same length.
 * The strings can be arranged such that there is one on each line, making a grid.
 * For example, strs = ["abc", "bce", "cae"] can be arranged as follows:
 * abc
 * bce
 * cae
 * You want to delete the columns that are not sorted lexicographically.
 * In the above example (0-indexed), columns 0 ('a', 'b', 'c') and 2 ('c', 'e', 'e') are sorted,
 * while column 1 ('b', 'c', 'a') is not, so you would delete column 1.
 * Return the number of columns that you will delete.
 * Example 1:
 * Input: strs = ["cba","daf","ghi"]
 * Output: 1
 * Explanation: The grid looks as follows:
 *   cba
 *   daf
 *   ghi
 * Columns 0 and 2 are sorted, but column 1 is not, so you only need to delete 1 column.
 * Example 2:
 * Input: strs = ["a","b"]
 * Output: 0
 * Explanation: The grid looks as follows:
 *   a
 *   b
 * Column 0 is the only column and is sorted, so you will not delete any columns.
 */
public class DeleteColumnsToBeSorted {
    public static void main(String[] args) {
        String[] strs = new String[]{"cba","daf","ghi"};
        System.out.println(minDeletionSize(strs));
    }

    // Method to find the minimum number of columns to be deleted so that each row is in non-decreasing order
    public static int minDeletionSize(String[] strs) {
        // m represents the length of the first string, assuming all strings are the same length.
        int columnLength = strs[0].length();
        // n represents the number of strings in the array.
        int rowLength = strs.length;
        // Initialize the counter for the minimum number of columns to delete.
        int minDeletions = 0;

        // Iterate over each column
        for (int columnIndex = 0; columnIndex < columnLength; ++columnIndex) {
            // Check each row in the current column, starting from the second row
            for (int rowIndex = 1; rowIndex < rowLength; ++rowIndex) {
                // Compare the current character with the one in the previous row.
                if (strs[rowIndex].charAt(columnIndex) < strs[rowIndex - 1].charAt(columnIndex)) {
                    // If the current character is smaller, increment the count of columns to delete
                    ++minDeletions;
                    // No need to check further in this column; break out of the inner loop.
                    break;
                }
            }
        }

        // Return the count of columns to delete so that all rows are sorted non-decreasingly
        return minDeletions;
    }
}
