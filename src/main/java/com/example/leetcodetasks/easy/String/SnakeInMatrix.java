package com.example.leetcodetasks.easy.String;

import java.util.List;

/**
 * There is a snake in an n x n matrix grid and can move in four possible directions.
 * Each cell in the grid is identified by the position: grid[i][j] = (i * n) + j.
 * The snake starts at cell 0 and follows a sequence of commands.
 * You are given an integer n representing the size of the grid and an array of strings commands where each command[i] is either "UP", "RIGHT", "DOWN", and "LEFT". It's guaranteed that the snake will remain within the grid boundaries throughout its movement.
 * Return the position of the final cell where the snake ends up after executing commands.
 * Example 1:
 * Input: n = 2, commands = ["RIGHT","DOWN"]
 * Output: 3
 * Explanation:
 */

public class SnakeInMatrix {

    int x = 0;
    int y = 0;

    public int finalPositionOfSnake(int n, List<String> commands) {
        for(String command:commands){
            helper(command.charAt(0));
        }
        return (x * n) + y;
    }

    public void helper(char c) {
        if(c=='R') y++;
        else if(c=='L') y--;
        else if(c=='D') x++;
        else x--;

    }
}
