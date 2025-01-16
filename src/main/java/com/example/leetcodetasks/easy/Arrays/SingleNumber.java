package com.example.leetcodetasks.easy.Arrays;

public class SingleNumber {

    public static void main(String[] args) {

        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int num: nums) {
            result ^= num;
        }
        return result;
    }
}
/**
 * Подробное решение:
 * int[] nums = {4, 1, 2, 1, 2};
 * int single = singleNumber(nums); // Возвращает 4
 * Процесс выполнения:
 * Инициализация: result = 0
 * После первого элемента (4): result = 0 ^ 4 = 4
 * После второго элемента (1): result = 4 ^ 1 = 5
 * После третьего элемента (2): result = 5 ^ 2 = 7
 * После четвертого элемента (1): result = 7 ^ 1 = 6
 * После пятого элемента (2): result = 6 ^ 2 = 4
 * В итоге метод возвращает 4, что является единственным числом в массиве.
 */