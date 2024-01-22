package com.example.leetcodetasks.easy.Math;
/*
Реверс числа без использования строк
 */

public class ReverseNumber {

    public static void main(String[] args) {
        int numb = 1245;
        ReverseNumber reverseNumber = new ReverseNumber();
        System.out.println(reverseNumber.reverse(numb));

    }
    public int reverse(int numb) {
        int local = 0;
        while (numb > 0) {
            local *= 10;
            local += numb % 10;
            numb /= 10;

        }
        return local;
    }
}
