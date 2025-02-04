package com.example.leetcodetasks.easy.String;

/**
 * You own a Goal Parser that can interpret a string command.
 * The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
 * The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al".
 * The interpreted strings are then concatenated in the original order.
 * Given the string command, return the Goal Parser's interpretation of command.
 * Example 1:
 * Input: command = "G()(al)"
 * Output: "Goal"
 * Explanation: The Goal Parser interprets the command as follows:
 * G -> G
 * () -> o
 * (al) -> al
 * The final concatenated result is "Goal".
 * Example 2:
 * Input: command = "G()()()()(al)"
 * Output: "Gooooal"
 * Example 3:
 * Input: command = "(al)G(al)()()G"
 * Output: "alGalooG"
 */
public class GoalParserInterpr {
    public static void main(String[] args) {
        String command = "(al)G(al)()()G";
        System.out.println(interpret(command));

    }

    public static String interpret(String command) {
        char[] charArray = command.toCharArray();
        StringBuilder newCommand = new StringBuilder();
        for(int i = 0; i < charArray.length; i++) {
            if(charArray[i] == 'G') {
                newCommand.append('G');
            }
            if(charArray[i] == '(') {
                if(charArray[i+1] == ')') {
                    newCommand.append('o');
                }
            }
            if(charArray[i] == '(') {
                if(charArray[i +1] == 'a') {
                    newCommand.append('a');
                    newCommand.append('l');
                }
            }
        }
        return newCommand.toString();
    }
}
