package com.example.leetcodetasks.easy.String;

import java.util.Arrays;

/**
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * A defanged IP address replaces every period "." with "[.]".
 * Example 1:
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 * Example 2:
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 */
public class DefangingIPAddress {
    public static void main(String[] args) {
        String ip = "255.100.50.0";
        System.out.println(defangIPaddr(ip));
    }

    public static String defangIPaddr(String address) {
        char[] charArray = new char[address.length() + 6];
        int j= 0;
        for(int i = 0; i < address.toCharArray().length; i++) {
            if(address.toCharArray()[i] == '.') {
                charArray[j] = '[';
                charArray[j+1] = '.';
                charArray[j+2] = ']';
                j+=3;
            } else {
                charArray[j] = address.toCharArray()[i];
                j++;
            }
        }
        return new String(charArray);
    }
}
