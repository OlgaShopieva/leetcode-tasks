package com.example.leetcodetasks.easy.String;

/**
 * You are given a string date representing a Gregorian calendar date in the yyyy-mm-dd format.
 * date can be written in its binary representation obtained by converting year, month,
 * and day to their binary representations without any leading zeroes and writing them down in year-month-day format.
 * Return the binary representation of date.
 * Example 1:
 * Input: date = "2080-02-29"
 * Output: "100000100000-10-11101"
 * Explanation:
 * 100000100000, 10, and 11101 are the binary representations of 2080, 02, and 29 respectively.
 */
public class ConvertDateToBinary {

    public static void main(String[] args) {
        String date = "2080-02-29";
        //variant1
        System.out.println(convertDateToBinary(date));
        //variant2
        System.out.println(convertDateToBinary2(date));

    }

    public static String convertDateToBinary(String date) {
        StringBuilder builder = new StringBuilder();
        String[] parts = date.split("-");
        for(String part: parts) {
            builder.append(convertNumToBinary(convertStrToNum(part)));
            builder.append("-");
        }

        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }

    private static int convertStrToNum(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            num = num * 10 + (str.charAt(i) - '0');
        }
        return num;
    }



    private static String convertNumToBinary(int num) {
        if (num == 0) return "0";

        StringBuilder binary = new StringBuilder();

        while (num > 0) {
            int remainder = num % 2;
            binary.insert(0, remainder);
            num /= 2;
        }

        return binary.toString();
    }

    public static String convertDateToBinary2(String date) {
        final int year = Integer.parseInt(date.substring(0, 4));
        final int month = Integer.parseInt(date.substring(5, 7));
        final int day = Integer.parseInt(date.substring(8, 10));
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toBinaryString(year))
                .append("-")
                .append(Integer.toBinaryString(month))
                .append("-")
                .append(Integer.toBinaryString(day));
        return sb.toString();
    }
}
