package com.example.leetcodetasks.easy.String;

public class FindValueAfterPerfOper {

    public static void main(String[] args) {
        String [] operations = new String[]{"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int value = 0;
        for(String op: operations) {
            if(op.equals("--X") || op.equals("X--")) {
                value--;
            } if (op.equals("++X") || op.equals("X++")) {
                value++;
            }
        }
        return value;
    }
}
