package com.example.leetcodetasks;

import com.example.leetcodetasks.easy.String.CheckIfPangram;
import com.example.leetcodetasks.easy.String.FaultyKeyboard;

public class Main {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        CheckIfPangram cp = new CheckIfPangram();
        System.out.println(cp.checkIfPangram(sentence));
    }
}
