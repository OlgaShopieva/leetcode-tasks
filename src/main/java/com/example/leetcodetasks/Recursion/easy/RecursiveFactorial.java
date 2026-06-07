package com.example.leetcodetasks.Recursion.easy;
/*
Рекурсивное вычисление факториала
 */
public class RecursiveFactorial {

    public static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }
}
