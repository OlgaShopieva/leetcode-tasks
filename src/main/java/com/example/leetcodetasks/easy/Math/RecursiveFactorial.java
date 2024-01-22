package com.example.leetcodetasks.easy.Math;
/*
Рекурсивное вычисление факториала
 */
public class RecursiveFactorial {
    public static void main(String[] args) {

        System.out.println(factorial(3));
    }


    public static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }
}
